package com.papb.eats.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.papb.eats.R
import com.papb.eats.model.Reminder
import kotlinx.android.synthetic.main.item_reminder.view.*

class RecyclerAdapter(private val reminders: ArrayList<Reminder>) : RecyclerView.Adapter<ReminderHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ReminderHolder {
        return ReminderHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_reminder, viewGroup,false))
    }

    override fun getItemCount(): Int {
        return reminders.size
    }

    override fun onBindViewHolder(holder: ReminderHolder, position: Int) {
        holder.bindItem(reminders[position])
    }

}

class ReminderHolder(view : View) : RecyclerView.ViewHolder(view) {
    private val tvReminderTime = view.tv_reminder_time
    private val tvReminderTitle = view.tv_reminder_title

    fun bindItem(reminder: Reminder) {
        tvReminderTime.text = reminder.time
        tvReminderTitle.text = reminder.title
    }
}
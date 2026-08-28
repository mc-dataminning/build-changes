package com.mojang.renderpearl.api.commands;

import com.mojang.renderpearl.util.UncheckedAutoCloseable;
import java.util.OptionalLong;

public interface GpuQuery extends UncheckedAutoCloseable {
   OptionalLong getValue();

   @Override
   void close();
}

package com.mojang.renderpearl.api.commands;

import com.mojang.renderpearl.util.UncheckedAutoCloseable;

public interface GpuFence extends UncheckedAutoCloseable {
   long NO_TIMEOUT = -1L;

   @Override
   void close();

   boolean awaitCompletion(final long timeoutNS);
}

package com.mojang.renderpearl.util;

import org.jspecify.annotations.Nullable;

public interface UncheckedAutoCloseable extends AutoCloseable {
   @Override
   void close();

   static void safeClose(@Nullable final UncheckedAutoCloseable closeable) {
      if (closeable != null) {
         closeable.close();
      }
   }
}

package com.mojang.blaze3d.buffers;

@fic
public enum BufferUsage {
   DYNAMIC_WRITE(false, true),
   STATIC_WRITE(false, true),
   STREAM_WRITE(false, true),
   STATIC_READ(true, false),
   DYNAMIC_READ(true, false),
   STREAM_READ(true, false),
   DYNAMIC_COPY(false, false),
   STATIC_COPY(false, false),
   STREAM_COPY(false, false);

   final boolean readable;
   final boolean writable;

   private BufferUsage(final boolean $$0, final boolean $$1) {
      this.readable = $$0;
      this.writable = $$1;
   }

   public boolean isReadable() {
      return this.readable;
   }

   public boolean isWritable() {
      return this.writable;
   }
}

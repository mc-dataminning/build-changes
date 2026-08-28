package com.mojang.blaze3d.buffers;

import java.nio.ByteBuffer;

@fic
public abstract class GpuBuffer implements AutoCloseable {
   private final BufferType type;
   private final BufferUsage usage;
   public int size;

   public GpuBuffer(BufferType $$0, BufferUsage $$1, int $$2) {
      this.type = $$0;
      this.size = $$2;
      this.usage = $$1;
   }

   public int size() {
      return this.size;
   }

   public BufferType type() {
      return this.type;
   }

   public BufferUsage usage() {
      return this.usage;
   }

   public abstract boolean isClosed();

   @Override
   public abstract void close();

   @fic
   public interface ReadView extends AutoCloseable {
      ByteBuffer data();

      @Override
      void close();
   }
}

package com.mojang.blaze3d.vertex;

import com.mojang.renderpearl.api.buffers.GpuBuffer;
import com.mojang.renderpearl.api.buffers.GpuBufferSlice;
import com.mojang.renderpearl.api.commands.CommandEncoder;
import com.mojang.renderpearl.api.device.GpuDevice;
import java.nio.ByteBuffer;
import java.util.Objects;
import net.minecraft.client.renderer.MappableRingBuffer;
import org.lwjgl.system.MemoryUtil;

public abstract class StagingBuffer implements AutoCloseable {
   private int nextWriteOffset;
   private int usedBufferCount;

   public static StagingBuffer create(final String name, final GpuDevice gpuDevice, final int bufferSize) {
      return (StagingBuffer)(gpuDevice.getDeviceInfo().hintsAndWorkarounds().writeToBufferIsSlow() && gpuDevice.getDeviceInfo().features().persistentMapping()
         ? new StagingBuffer.PersistentlyMapped(name, bufferSize)
         : new StagingBuffer.Cpu(bufferSize));
   }

   public StagingBuffer.BufferHandle tryAppend(final ByteBuffer buffer) {
      int writeOffset = this.nextWriteOffset;
      int bufferSize = buffer.remaining();
      ByteBuffer writeBuffer = this.getWriteBuffer();
      if (bufferSize > writeBuffer.capacity()) {
         throw new IllegalArgumentException("Cannot fit allocation of size " + bufferSize + " into staging buffer of size " + writeBuffer.capacity());
      } else if (bufferSize > writeBuffer.capacity() - writeOffset) {
         return null;
      } else {
         MemoryUtil.memCopy(buffer, writeBuffer.position(writeOffset));
         this.nextWriteOffset += bufferSize;
         this.usedBufferCount++;
         return new StagingBuffer.BufferHandle(writeOffset, bufferSize);
      }
   }

   protected abstract ByteBuffer getWriteBuffer();

   protected abstract void copyTo(final CommandEncoder encoder, final GpuBuffer dstBuffer, long dstOffset, long stagingBufferOffset, long copySize);

   protected void rotateBuffer() {
   }

   public StagingBuffer.Uploader startUploading(final CommandEncoder encoder) {
      return new StagingBuffer.Uploader(encoder);
   }

   private void tryClearAndRotate() {
      if (this.nextWriteOffset > 0 && this.usedBufferCount == 0) {
         this.rotateBuffer();
         this.nextWriteOffset = 0;
      }
   }

   @Override
   public abstract void close();

   public class BufferHandle implements AutoCloseable {
      private final int offset;
      private final int size;
      private boolean closed;

      public BufferHandle(final int offset, final int size) {
         Objects.requireNonNull(StagingBuffer.this);
         super();
         this.offset = offset;
         this.size = size;
      }

      private void checkValidFor(final StagingBuffer stagingBuffer) {
         if (this.closed) {
            throw new IllegalStateException("Buffer has already been closed");
         } else if (stagingBuffer != StagingBuffer.this) {
            throw new IllegalArgumentException("Buffer is not valid for " + stagingBuffer);
         }
      }

      public long size() {
         return (long)this.size;
      }

      @Override
      public void close() {
         if (!this.closed) {
            this.closed = true;
            StagingBuffer.this.usedBufferCount--;
         }
      }
   }

   private static class Cpu extends StagingBuffer {
      private final ByteBuffer stagingBuffer;

      private Cpu(final int bufferSize) {
         this.stagingBuffer = MemoryUtil.memAlloc(bufferSize);
      }

      @Override
      protected ByteBuffer getWriteBuffer() {
         return this.stagingBuffer;
      }

      @Override
      protected void copyTo(final CommandEncoder encoder, final GpuBuffer dstBuffer, final long dstOffset, final long stagingBufferOffset, final long copySize) {
         encoder.writeToBuffer(dstBuffer.slice(dstOffset, copySize), this.stagingBuffer.slice((int)stagingBufferOffset, (int)copySize));
      }

      @Override
      public void close() {
         MemoryUtil.memFree(this.stagingBuffer);
      }
   }

   private static class PersistentlyMapped extends StagingBuffer {
      private final MappableRingBuffer mappableRingBuffer;
      private GpuBufferSlice.MappedView currentMappedView;
      private GpuBuffer currentGPUBuffer;
      private ByteBuffer currentBuffer;

      private PersistentlyMapped(final String name, final int bufferSize) {
         this.mappableRingBuffer = new MappableRingBuffer(() -> name + " staging buffer", 18, bufferSize / 2);
         this.currentGPUBuffer = this.mappableRingBuffer.currentBuffer();
         this.currentMappedView = this.currentGPUBuffer.map(false, true);
         this.currentBuffer = this.currentMappedView.data();
      }

      @Override
      protected ByteBuffer getWriteBuffer() {
         return this.currentBuffer;
      }

      @Override
      protected void copyTo(final CommandEncoder encoder, final GpuBuffer dstBuffer, final long dstOffset, final long stagingBufferOffset, final long copySize) {
         encoder.copyToBuffer(this.currentGPUBuffer.slice(stagingBufferOffset, copySize), dstBuffer.slice(dstOffset, copySize));
      }

      @Override
      protected void rotateBuffer() {
         this.currentMappedView.close();
         this.mappableRingBuffer.rotate();
         this.currentGPUBuffer = this.mappableRingBuffer.currentBuffer();
         this.currentMappedView = this.currentGPUBuffer.map(false, true);
         this.currentBuffer = this.currentMappedView.data();
      }

      @Override
      public void close() {
         this.currentMappedView.close();
         this.mappableRingBuffer.close();
      }
   }

   public class Uploader implements AutoCloseable {
      private final CommandEncoder encoder;

      public Uploader(final CommandEncoder encoder) {
         Objects.requireNonNull(StagingBuffer.this);
         super();
         this.encoder = encoder;
      }

      public void copyTo(final StagingBuffer.BufferHandle srcBuffer, final GpuBuffer dstBuffer, final long dstOffset) {
         srcBuffer.checkValidFor(StagingBuffer.this);
         StagingBuffer.this.copyTo(this.encoder, dstBuffer, dstOffset, (long)srcBuffer.offset, (long)srcBuffer.size);
      }

      @Override
      public void close() {
         StagingBuffer.this.tryClearAndRotate();
      }

      public void checkValidFor(final StagingBuffer stagingBuffer) {
         if (stagingBuffer != StagingBuffer.this) {
            throw new IllegalArgumentException("Uploader is not valid for " + stagingBuffer);
         }
      }
   }
}

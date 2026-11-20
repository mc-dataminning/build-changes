package com.mojang.renderpearl.util.dx.dxgi;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class DXGISwapchainDesc1 {
   public static final StructLayout LAYOUT = MemoryLayout.structLayout(
      ValueLayout.JAVA_INT.withName("Width"),
      ValueLayout.JAVA_INT.withName("Height"),
      ValueLayout.JAVA_INT.withName("Format"),
      ValueLayout.JAVA_INT.withName("Stereo"),
      DXGISampleDesc.LAYOUT.withName("SampleDesc"),
      ValueLayout.JAVA_INT.withName("BufferUsage"),
      ValueLayout.JAVA_INT.withName("BufferCount"),
      ValueLayout.JAVA_INT.withName("Scaling"),
      ValueLayout.JAVA_INT.withName("SwapEffect"),
      ValueLayout.JAVA_INT.withName("AlphaMode"),
      ValueLayout.JAVA_INT.withName("Flags")
   );
   private static final VarHandle WIDTH_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Width")), 1, 0);
   private static final VarHandle HEIGHT_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Height")), 1, 0);
   private static final VarHandle FORMAT_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Format")), 1, 0);
   private static final VarHandle STEREO_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Stereo")), 1, 0);
   private static final long SAMPLE_DESC_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("SampleDesc"));
   private static final VarHandle BUFFER_USAGE_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("BufferUsage")), 1, 0);
   private static final VarHandle BUFFER_COUNT_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("BufferCount")), 1, 0);
   private static final VarHandle SCALING_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Scaling")), 1, 0);
   private static final VarHandle SWAP_EFFECT_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("SwapEffect")), 1, 0);
   private static final VarHandle ALPHA_MODE_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("AlphaMode")), 1, 0);
   private static final VarHandle FLAGS_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Flags")), 1, 0);
   private final MemorySegment segment;

   public DXGISwapchainDesc1(final MemorySegment segment) {
      if (segment.byteSize() != LAYOUT.byteSize()) {
         throw new IllegalArgumentException();
      }

      this.segment = segment;
   }

   public DXGISwapchainDesc1(final Arena arena) {
      this(arena.allocate(LAYOUT));
   }

   public MemorySegment address() {
      return this.segment;
   }

   public int width() {
      return (int)WIDTH_HANDLE.get((MemorySegment)this.segment);
   }

   public void width(final int width) {
      WIDTH_HANDLE.set((MemorySegment)this.segment, (int)width);
   }

   public int height() {
      return (int)HEIGHT_HANDLE.get((MemorySegment)this.segment);
   }

   public void height(final int height) {
      HEIGHT_HANDLE.set((MemorySegment)this.segment, (int)height);
   }

   public int format() {
      return (int)FORMAT_HANDLE.get((MemorySegment)this.segment);
   }

   public void format(final int format) {
      FORMAT_HANDLE.set((MemorySegment)this.segment, (int)format);
   }

   public boolean stereo() {
      return (int)STEREO_HANDLE.get((MemorySegment)this.segment) != 0;
   }

   public void stereo(final boolean stereo) {
      STEREO_HANDLE.set((MemorySegment)this.segment, (int)(stereo ? 1 : 0));
   }

   public DXGISampleDesc sampleDesc() {
      return new DXGISampleDesc(this.segment.asSlice(SAMPLE_DESC_OFFSET, DXGISampleDesc.LAYOUT.byteSize()));
   }

   public int bufferUsage() {
      return (int)BUFFER_USAGE_HANDLE.get((MemorySegment)this.segment);
   }

   public void bufferUsage(final int bufferUsage) {
      BUFFER_USAGE_HANDLE.set((MemorySegment)this.segment, (int)bufferUsage);
   }

   public int bufferCount() {
      return (int)BUFFER_COUNT_HANDLE.get((MemorySegment)this.segment);
   }

   public void bufferCount(final int bufferCount) {
      BUFFER_COUNT_HANDLE.set((MemorySegment)this.segment, (int)bufferCount);
   }

   public int scaling() {
      return (int)SCALING_HANDLE.get((MemorySegment)this.segment);
   }

   public void scaling(final int scaling) {
      SCALING_HANDLE.set((MemorySegment)this.segment, (int)scaling);
   }

   public int swapEffect() {
      return (int)SWAP_EFFECT_HANDLE.get((MemorySegment)this.segment);
   }

   public void swapEffect(final int swapEffect) {
      SWAP_EFFECT_HANDLE.set((MemorySegment)this.segment, (int)swapEffect);
   }

   public int alphaMode() {
      return (int)ALPHA_MODE_HANDLE.get((MemorySegment)this.segment);
   }

   public void alphaMode(final int alphaMode) {
      ALPHA_MODE_HANDLE.set((MemorySegment)this.segment, (int)alphaMode);
   }

   public int flags() {
      return (int)FLAGS_HANDLE.get((MemorySegment)this.segment);
   }

   public void flags(final int flags) {
      FLAGS_HANDLE.set((MemorySegment)this.segment, (int)flags);
   }
}

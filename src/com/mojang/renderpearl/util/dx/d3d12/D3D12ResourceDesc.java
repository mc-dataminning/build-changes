package com.mojang.renderpearl.util.dx.d3d12;

import com.mojang.renderpearl.util.dx.dxgi.DXGISampleDesc;
import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class D3D12ResourceDesc {
   public static final StructLayout LAYOUT = MemoryLayout.structLayout(
      ValueLayout.JAVA_INT.withName("Dimension"),
      ValueLayout.JAVA_INT.withName("__PADDING1"),
      ValueLayout.JAVA_LONG.withName("Alignment"),
      ValueLayout.JAVA_LONG.withName("Width"),
      ValueLayout.JAVA_INT.withName("Height"),
      ValueLayout.JAVA_SHORT.withName("DepthOrArrayStride"),
      ValueLayout.JAVA_SHORT.withName("MipLevels"),
      ValueLayout.JAVA_INT.withName("Format"),
      DXGISampleDesc.LAYOUT.withName("SampleDesc"),
      ValueLayout.JAVA_INT.withName("Layout"),
      ValueLayout.JAVA_INT.withName("Flags"),
      ValueLayout.JAVA_INT.withName("NodeMask"),
      ValueLayout.JAVA_INT.withName("__PADDING2")
   );
   private static final VarHandle DIMENSION_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Dimension")), 1, 0);
   private static final VarHandle ALIGNMENT_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Alignment")), 1, 0);
   private static final VarHandle WIDTH_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Width")), 1, 0);
   private static final VarHandle HEIGHT_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Height")), 1, 0);
   private static final VarHandle DEPTH_OR_ARRAY_STRIDE_HANDLE = MethodHandles.insertCoordinates(
      LAYOUT.varHandle(PathElement.groupElement("DepthOrArrayStride")), 1, 0
   );
   private static final VarHandle MIP_LEVELS_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("MipLevels")), 1, 0);
   private static final VarHandle FORMAT_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Format")), 1, 0);
   private static final long SAMPLE_DESC_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("SampleDesc"));
   private static final VarHandle LAYOUT_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Layout")), 1, 0);
   private static final VarHandle FLAGS_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Flags")), 1, 0);
   private static final VarHandle NODE_MASK_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("NodeMask")), 1, 0);
   private final MemorySegment segment;

   public D3D12ResourceDesc(final MemorySegment segment) {
      if (segment.byteSize() != LAYOUT.byteSize()) {
         throw new IllegalArgumentException();
      }

      this.segment = segment;
   }

   public D3D12ResourceDesc(final Arena arena) {
      this(arena.allocate(LAYOUT));
   }

   public MemorySegment address() {
      return this.segment;
   }

   public int dimension() {
      return (int)DIMENSION_HANDLE.get((MemorySegment)this.segment);
   }

   public void dimension(final int dimensions) {
      DIMENSION_HANDLE.set((MemorySegment)this.segment, (int)dimensions);
   }

   public int alignment() {
      return (int)ALIGNMENT_HANDLE.get((MemorySegment)this.segment);
   }

   public void alignment(final int alignment) {
      ALIGNMENT_HANDLE.set((MemorySegment)this.segment, (int)alignment);
   }

   public long width() {
      return (long)WIDTH_HANDLE.get((MemorySegment)this.segment);
   }

   public void width(final long width) {
      WIDTH_HANDLE.set((MemorySegment)this.segment, (long)width);
   }

   public int height() {
      return (int)HEIGHT_HANDLE.get((MemorySegment)this.segment);
   }

   public void height(final int height) {
      HEIGHT_HANDLE.set((MemorySegment)this.segment, (int)height);
   }

   public short depthOrArrayStride() {
      return (short)DEPTH_OR_ARRAY_STRIDE_HANDLE.get((MemorySegment)this.segment);
   }

   public void depthOrArrayStride(final short depthOrArrayStride) {
      DEPTH_OR_ARRAY_STRIDE_HANDLE.set((MemorySegment)this.segment, (short)depthOrArrayStride);
   }

   public short mipLevels() {
      return (short)MIP_LEVELS_HANDLE.get((MemorySegment)this.segment);
   }

   public void mipLevels(final short mipLevels) {
      MIP_LEVELS_HANDLE.set((MemorySegment)this.segment, (short)mipLevels);
   }

   public int format() {
      return (int)FORMAT_HANDLE.get((MemorySegment)this.segment);
   }

   public void format(final int format) {
      FORMAT_HANDLE.set((MemorySegment)this.segment, (int)format);
   }

   public DXGISampleDesc sampleDesc() {
      return new DXGISampleDesc(this.segment.asSlice(SAMPLE_DESC_OFFSET, DXGISampleDesc.LAYOUT.byteSize()));
   }

   public int layout() {
      return (int)LAYOUT_HANDLE.get((MemorySegment)this.segment);
   }

   public void layout(final int layout) {
      LAYOUT_HANDLE.set((MemorySegment)this.segment, (int)layout);
   }

   public int flags() {
      return (int)FLAGS_HANDLE.get((MemorySegment)this.segment);
   }

   public void flags(final int flags) {
      FLAGS_HANDLE.set((MemorySegment)this.segment, (int)flags);
   }

   public int nodeMask() {
      return (int)NODE_MASK_HANDLE.get((MemorySegment)this.segment);
   }

   public void nodeMask(final int nodeMask) {
      NODE_MASK_HANDLE.set((MemorySegment)this.segment, (int)nodeMask);
   }
}

package com.mojang.renderpearl.util.dx.d3d12;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class D3D12CommandQueueDesc {
   public static final StructLayout LAYOUT = MemoryLayout.structLayout(
      ValueLayout.JAVA_INT.withName("Type"),
      ValueLayout.JAVA_INT.withName("Priority"),
      ValueLayout.JAVA_INT.withName("Flags"),
      ValueLayout.JAVA_INT.withName("NodeMask")
   );
   private static final VarHandle TYPE_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Type")), 1, 0);
   private static final VarHandle PRIORITY_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Priority")), 1, 0);
   private static final VarHandle FLAGS_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Flags")), 1, 0);
   private static final VarHandle NODE_MASK_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("NodeMask")), 1, 0);
   private final MemorySegment segment;

   public D3D12CommandQueueDesc(final MemorySegment segment) {
      if (segment.byteSize() != LAYOUT.byteSize()) {
         throw new IllegalArgumentException();
      }

      this.segment = segment;
   }

   public D3D12CommandQueueDesc(final Arena arena) {
      this(arena.allocate(LAYOUT));
   }

   public MemorySegment address() {
      return this.segment;
   }

   public int type() {
      return (int)TYPE_HANDLE.get((MemorySegment)this.segment);
   }

   public void type(final int type) {
      TYPE_HANDLE.set((MemorySegment)this.segment, (int)type);
   }

   public int priority() {
      return (int)PRIORITY_HANDLE.get((MemorySegment)this.segment);
   }

   public void priority(final int priority) {
      PRIORITY_HANDLE.set((MemorySegment)this.segment, (int)priority);
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

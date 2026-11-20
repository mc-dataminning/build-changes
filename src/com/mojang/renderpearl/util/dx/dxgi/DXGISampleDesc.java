package com.mojang.renderpearl.util.dx.dxgi;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class DXGISampleDesc {
   public static final StructLayout LAYOUT = MemoryLayout.structLayout(ValueLayout.JAVA_INT.withName("Count"), ValueLayout.JAVA_INT.withName("Quality"));
   private static final VarHandle COUNT_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Count")), 1, 0);
   private static final VarHandle QUALITY_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Quality")), 1, 0);
   private final MemorySegment segment;

   public DXGISampleDesc(final MemorySegment segment) {
      if (segment.byteSize() != LAYOUT.byteSize()) {
         throw new IllegalArgumentException();
      }

      this.segment = segment;
   }

   public DXGISampleDesc(final Arena arena) {
      this(arena.allocate(LAYOUT));
   }

   public int count() {
      return (int)COUNT_HANDLE.get((MemorySegment)this.segment);
   }

   public void count(final int count) {
      COUNT_HANDLE.set((MemorySegment)this.segment, (int)count);
   }

   public int quality() {
      return (int)QUALITY_HANDLE.get((MemorySegment)this.segment);
   }

   public void quality(final int quality) {
      QUALITY_HANDLE.set((MemorySegment)this.segment, (int)quality);
   }
}

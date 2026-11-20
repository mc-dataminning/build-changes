package com.mojang.renderpearl.util.dx.d3d12;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class D3D12HeapProperties {
   public static final StructLayout LAYOUT = MemoryLayout.structLayout(
      ValueLayout.JAVA_INT.withName("Type"),
      ValueLayout.JAVA_INT.withName("CPUPageProperty"),
      ValueLayout.JAVA_INT.withName("MemoryPoolPreference"),
      ValueLayout.JAVA_INT.withName("CreationNodeMask"),
      ValueLayout.JAVA_INT.withName("VisibleNodeMask")
   );
   private static final VarHandle TYPE_HANDLE = MethodHandles.insertCoordinates(LAYOUT.varHandle(PathElement.groupElement("Type")), 1, 0);
   private static final VarHandle CPU_PAGE_PROPERTY_HANDLE = MethodHandles.insertCoordinates(
      LAYOUT.varHandle(PathElement.groupElement("CPUPageProperty")), 1, 0
   );
   private static final VarHandle MEMORY_POOL_PREFERENCE_HANDLE = MethodHandles.insertCoordinates(
      LAYOUT.varHandle(PathElement.groupElement("MemoryPoolPreference")), 1, 0
   );
   private static final VarHandle CREATION_NODE_MASK_HANDLE = MethodHandles.insertCoordinates(
      LAYOUT.varHandle(PathElement.groupElement("CreationNodeMask")), 1, 0
   );
   private static final VarHandle VISIBLE_NODE_MASK_HANDLE = MethodHandles.insertCoordinates(
      LAYOUT.varHandle(PathElement.groupElement("VisibleNodeMask")), 1, 0
   );
   private final MemorySegment segment;

   public D3D12HeapProperties(final MemorySegment segment) {
      if (segment.byteSize() != LAYOUT.byteSize()) {
         throw new IllegalArgumentException();
      }

      this.segment = segment;
   }

   public D3D12HeapProperties(final Arena arena) {
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

   public int cpuPageProperty() {
      return (int)CPU_PAGE_PROPERTY_HANDLE.get((MemorySegment)this.segment);
   }

   public void cpuPageProperty(final int cpuPageProperty) {
      CPU_PAGE_PROPERTY_HANDLE.set((MemorySegment)this.segment, (int)cpuPageProperty);
   }

   public int memoryPoolPreference() {
      return (int)MEMORY_POOL_PREFERENCE_HANDLE.get((MemorySegment)this.segment);
   }

   public void memoryPoolPreference(final int memoryPoolPreference) {
      MEMORY_POOL_PREFERENCE_HANDLE.set((MemorySegment)this.segment, (int)memoryPoolPreference);
   }

   public int creationNodeMask() {
      return (int)CREATION_NODE_MASK_HANDLE.get((MemorySegment)this.segment);
   }

   public void creationNodeMask(final int creationNodeMask) {
      CREATION_NODE_MASK_HANDLE.set((MemorySegment)this.segment, (int)creationNodeMask);
   }

   public int visibleNodeMask() {
      return (int)VISIBLE_NODE_MASK_HANDLE.get((MemorySegment)this.segment);
   }

   public void visibleNodeMask(final int visibleNodeMask) {
      VISIBLE_NODE_MASK_HANDLE.set((MemorySegment)this.segment, (int)visibleNodeMask);
   }
}

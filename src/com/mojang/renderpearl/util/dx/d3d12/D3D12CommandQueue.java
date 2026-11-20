package com.mojang.renderpearl.util.dx.d3d12;

import com.mojang.renderpearl.util.dx.COMUnknown;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

public class D3D12CommandQueue extends D3D12Pageable {
   private final MethodHandle executeCommandLists = this.vtable(
      10L,
      FunctionDescriptor.ofVoid(
         COMUnknown.Types.SELF_PTR, COMUnknown.Types.UINT32.withName("commandListCount"), COMUnknown.Types.POINTER.withName("ppCommandLists")
      )
   );
   private final MethodHandle signal = this.vtable(
      14L,
      FunctionDescriptor.of(
         COMUnknown.Types.HRESULT, COMUnknown.Types.SELF_PTR, COMUnknown.Types.POINTER.withName("fence"), COMUnknown.Types.UINT64.withName("value")
      )
   );
   private final MethodHandle wait = this.vtable(
      15L,
      FunctionDescriptor.of(
         COMUnknown.Types.HRESULT, COMUnknown.Types.SELF_PTR, COMUnknown.Types.POINTER.withName("fence"), COMUnknown.Types.UINT64.withName("value")
      )
   );

   public D3D12CommandQueue(final MemorySegment address) {
      super(address);
   }

   public void executeCommandList(final D3D12GraphicsCommandList commandList) {
      try (Arena arena = Arena.ofConfined()) {
         MemorySegment listList = arena.allocate(COMUnknown.Types.POINTER);
         listList.set(COMUnknown.Types.POINTER, 0L, commandList.address());
         this.executeCommandLists.invokeExact((MemorySegment)this.address(), (int)1, (MemorySegment)listList);
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public int signal(final D3D12Fence fence, final long value) {
      try {
         return (int)this.signal.invokeExact((MemorySegment)this.address(), (MemorySegment)fence.address(), (long)value);
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public int wait(final D3D12Fence fence, final long value) {
      try {
         return (int)this.wait.invokeExact((MemorySegment)this.address(), (MemorySegment)fence.address(), (long)value);
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }
}

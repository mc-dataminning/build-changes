package com.mojang.renderpearl.util.dx.d3d12;

import com.mojang.renderpearl.util.dx.COMUnknown;
import com.mojang.renderpearl.util.dx.DXUtils;
import com.mojang.renderpearl.util.dx.IID;
import com.mojang.renderpearl.util.dx.OutPtrHelper;
import com.mojang.renderpearl.util.dx.Win32Handle;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

public class D3D12Device extends D3D12Object {
   private final MethodHandle createCommandQueue = this.vtable(
      8L,
      FunctionDescriptor.of(
         COMUnknown.Types.HRESULT,
         COMUnknown.Types.SELF_PTR,
         COMUnknown.Types.POINTER.withName("desc"),
         COMUnknown.Types.IID_PTR,
         COMUnknown.Types.COM_OUTPTR.withName("ppCommandQueue")
      )
   );
   private final MethodHandle createCommandAllocator = this.vtable(
      9L,
      FunctionDescriptor.of(
         COMUnknown.Types.HRESULT,
         COMUnknown.Types.SELF_PTR,
         COMUnknown.Types.C_ENUM.withName("type"),
         COMUnknown.Types.IID_PTR,
         COMUnknown.Types.COM_OUTPTR.withName("ppCommandQueue")
      )
   );
   private final MethodHandle createCommandList = this.vtable(
      12L,
      FunctionDescriptor.of(
         COMUnknown.Types.HRESULT,
         COMUnknown.Types.SELF_PTR,
         COMUnknown.Types.UINT32.withName("nodeMask"),
         COMUnknown.Types.C_ENUM.withName("type"),
         COMUnknown.Types.POINTER.withName("commandAllocator"),
         COMUnknown.Types.POINTER.withName("initialPipelineState"),
         COMUnknown.Types.IID_PTR,
         COMUnknown.Types.COM_OUTPTR.withName("ppCommandQueue")
      )
   );
   private final MethodHandle createCommittedResource = this.vtable(
      27L,
      FunctionDescriptor.of(
         COMUnknown.Types.HRESULT,
         COMUnknown.Types.SELF_PTR,
         COMUnknown.Types.POINTER.withName("HeapProperties"),
         COMUnknown.Types.C_ENUM.withName("HeapFlags"),
         COMUnknown.Types.POINTER.withName("Desc"),
         COMUnknown.Types.C_ENUM.withName("InitialResourceState"),
         COMUnknown.Types.POINTER.withName("OptimizedClearValue"),
         COMUnknown.Types.IID_PTR,
         COMUnknown.Types.COM_OUTPTR.withName("Resource")
      )
   );
   private final MethodHandle createSharedHandle = this.vtable(
      31L,
      FunctionDescriptor.of(
         COMUnknown.Types.HRESULT,
         COMUnknown.Types.SELF_PTR,
         COMUnknown.Types.POINTER.withName("object"),
         COMUnknown.Types.POINTER.withName("attributes"),
         COMUnknown.Types.UINT32.withName("access"),
         COMUnknown.Types.POINTER.withName("name"),
         COMUnknown.Types.POINTER.withName("handle").withTargetLayout(COMUnknown.Types.HANDLE)
      )
   );
   private final MethodHandle openSharedHandle = this.vtable(
      32L,
      FunctionDescriptor.of(
         COMUnknown.Types.HRESULT,
         COMUnknown.Types.SELF_PTR,
         COMUnknown.Types.HANDLE.withName("handle"),
         COMUnknown.Types.IID_PTR,
         COMUnknown.Types.COM_OUTPTR.withName("object")
      )
   );
   private final MethodHandle createFence = this.vtable(
      36L,
      FunctionDescriptor.of(
         COMUnknown.Types.HRESULT,
         COMUnknown.Types.SELF_PTR,
         COMUnknown.Types.UINT64.withName("initialValue"),
         COMUnknown.Types.C_ENUM.withName("flags"),
         COMUnknown.Types.IID_PTR,
         COMUnknown.Types.COM_OUTPTR.withName("fence")
      )
   );

   public D3D12Device(final MemorySegment address) {
      super(address);
   }

   public D3D12CommandQueue createCommandQueue(final D3D12CommandQueueDesc desc) {
      try (OutPtrHelper outPtr = new OutPtrHelper()) {
         DXUtils.crashIfFailure(
            (int)this.createCommandQueue
               .invokeExact(
                  (MemorySegment)this.address(),
                  (MemorySegment)desc.address(),
                  (MemorySegment)outPtr.allocate(IID.ID3D12CommandQueue),
                  (MemorySegment)outPtr.target()
               )
         );
         return new D3D12CommandQueue(outPtr.result());
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public D3D12CommandAllocator createCommandAllocator(final int type) {
      try (OutPtrHelper outPtr = new OutPtrHelper()) {
         DXUtils.crashIfFailure(
            (int)this.createCommandAllocator
               .invokeExact(
                  (MemorySegment)this.address(), (int)type, (MemorySegment)outPtr.allocate(IID.ID3D12CommandAllocator), (MemorySegment)outPtr.target()
               )
         );
         return new D3D12CommandAllocator(outPtr.result());
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public D3D12GraphicsCommandList createCommandList(final int nodeMask, final int type, final D3D12CommandAllocator commandAllocator) {
      try (OutPtrHelper outPtr = new OutPtrHelper()) {
         DXUtils.crashIfFailure(
            (int)this.createCommandList
               .invokeExact(
                  (MemorySegment)this.address(),
                  (int)nodeMask,
                  (int)type,
                  (MemorySegment)commandAllocator.address(),
                  (MemorySegment)MemorySegment.NULL,
                  (MemorySegment)outPtr.allocate(IID.ID3D12CommandList),
                  (MemorySegment)outPtr.target()
               )
         );
         return new D3D12GraphicsCommandList(outPtr.result());
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public D3D12Resource createCommittedResource(
      final D3D12HeapProperties heapProperties, final int heapFlags, final D3D12ResourceDesc desc, final int initialResourceState
   ) {
      try (OutPtrHelper outPtr = new OutPtrHelper()) {
         DXUtils.crashIfFailure(
            (int)this.createCommittedResource
               .invokeExact(
                  (MemorySegment)this.address(),
                  (MemorySegment)heapProperties.address(),
                  (int)heapFlags,
                  (MemorySegment)desc.address(),
                  (int)initialResourceState,
                  (MemorySegment)MemorySegment.NULL,
                  (MemorySegment)outPtr.allocate(IID.ID3D12Resource),
                  (MemorySegment)outPtr.target()
               )
         );
         return new D3D12Resource(outPtr.result());
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public Win32Handle createSharedHandle(final D3D12DeviceChild object) {
      try (Arena arena = Arena.ofConfined()) {
         MemorySegment handlePtr = arena.allocate(COMUnknown.Types.HANDLE);
         DXUtils.crashIfFailure(
            (int)this.createSharedHandle
               .invokeExact(
                  (MemorySegment)this.address(),
                  (MemorySegment)object.address(),
                  (MemorySegment)MemorySegment.NULL,
                  (int)268435456,
                  (MemorySegment)MemorySegment.NULL,
                  (MemorySegment)handlePtr
               )
         );
         return new Win32Handle(handlePtr.get(COMUnknown.Types.HANDLE, 0L));
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public D3D12Resource openSharedHandle(final Win32Handle handle) {
      try (OutPtrHelper outPtr = new OutPtrHelper()) {
         DXUtils.crashIfFailure(
            (int)this.openSharedHandle
               .invokeExact(
                  (MemorySegment)this.address(), (long)handle.handle(), (MemorySegment)outPtr.allocate(IID.ID3D12Resource), (MemorySegment)outPtr.target()
               )
         );
         return new D3D12Resource(outPtr.result());
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public D3D12Fence createFence(final long initialValue, final int flags) {
      try (OutPtrHelper outPtr = new OutPtrHelper()) {
         DXUtils.crashIfFailure(
            (int)this.createFence
               .invokeExact(
                  (MemorySegment)this.address(),
                  (long)initialValue,
                  (int)flags,
                  (MemorySegment)outPtr.allocate(IID.ID3D12Fence),
                  (MemorySegment)outPtr.target()
               )
         );
         return new D3D12Fence(outPtr.result());
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }
}

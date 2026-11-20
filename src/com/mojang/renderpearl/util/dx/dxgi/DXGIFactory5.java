package com.mojang.renderpearl.util.dx.dxgi;

import com.mojang.renderpearl.util.dx.COMUnknown;
import com.mojang.renderpearl.util.dx.DXUtils;
import com.mojang.renderpearl.util.dx.IID;
import com.mojang.renderpearl.util.dx.OutPtrHelper;
import com.mojang.renderpearl.util.dx.d3d12.D3D12CommandQueue;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

public class DXGIFactory5 extends DXGIObject {
   private static final MethodHandle createDxgiFactory2 = loadStaticFunction(
      "CreateDXGIFactory2",
      FunctionDescriptor.of(
         COMUnknown.Types.HRESULT, COMUnknown.Types.UINT32.withName("Flags"), COMUnknown.Types.IID_PTR, COMUnknown.Types.COM_OUTPTR.withName("ppFactory")
      )
   );
   private final MethodHandle makeWindowAssociation = this.vtable(
      8L,
      FunctionDescriptor.of(
         COMUnknown.Types.HRESULT, COMUnknown.Types.SELF_PTR, COMUnknown.Types.HWND.withName("hwnd"), COMUnknown.Types.UINT32.withName("Flags")
      )
   );
   private final MethodHandle createSwapChainForHwnd = this.vtable(
      15L,
      FunctionDescriptor.of(
         COMUnknown.Types.HRESULT,
         COMUnknown.Types.SELF_PTR,
         COMUnknown.Types.POINTER.withName("pDevice"),
         COMUnknown.Types.HWND.withName("hwnd"),
         COMUnknown.Types.POINTER.withName("pDesc"),
         COMUnknown.Types.POINTER.withName("pFullscreenDesc"),
         COMUnknown.Types.POINTER.withName("pRestrictToOutput"),
         COMUnknown.Types.COM_OUTPTR.withName("IDXGISwapchain1** ppSwapChain")
      )
   );
   private final MethodHandle enumAdapterByLuid = this.vtable(
      26L,
      FunctionDescriptor.of(
         COMUnknown.Types.HRESULT,
         COMUnknown.Types.SELF_PTR,
         COMUnknown.Types.POINTER.withName("AdapterLuid"),
         COMUnknown.Types.IID_PTR,
         COMUnknown.Types.COM_OUTPTR.withName("ppvAdapter")
      )
   );
   private final MethodHandle checkFeatureSupport = this.vtable(
      28L,
      FunctionDescriptor.of(
         COMUnknown.Types.HRESULT,
         COMUnknown.Types.SELF_PTR,
         COMUnknown.Types.C_ENUM.withName("feature"),
         COMUnknown.Types.POINTER.withName("supportData"),
         COMUnknown.Types.UINT32.withName("supportDataSize")
      )
   );

   public static DXGIFactory5 create() {
      try (OutPtrHelper outPtr = new OutPtrHelper()) {
         DXUtils.crashIfFailure((int)createDxgiFactory2.invokeExact((int)0, (MemorySegment)outPtr.allocate(IID.IDXGIFactory5), (MemorySegment)outPtr.target()));
         return new DXGIFactory5(outPtr.result());
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   private DXGIFactory5(final MemorySegment address) {
      super(address);
   }

   public void makeWindowAssociation(final long hwnd, final int flags) {
      try {
         DXUtils.crashIfFailure((int)this.makeWindowAssociation.invokeExact((MemorySegment)this.address(), (long)hwnd, (int)flags));
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public boolean adapterWithLuidExists(final MemorySegment luid) {
      try (OutPtrHelper outPtr = new OutPtrHelper()) {
         int result = (int)this.enumAdapterByLuid
            .invokeExact((MemorySegment)this.address(), (MemorySegment)luid, (MemorySegment)outPtr.allocate(IID.IDXGIAdapter), (MemorySegment)outPtr.target());
         if (DXUtils.failure(result)) {
            return false;
         }

         new DXGIAdapter(outPtr.result()).close();
         return true;
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public DXGIAdapter enumAdapterByLuid(final MemorySegment luid) {
      try (OutPtrHelper outPtr = new OutPtrHelper()) {
         DXUtils.crashIfFailure(
            (int)this.enumAdapterByLuid
               .invokeExact(
                  (MemorySegment)this.address(), (MemorySegment)luid, (MemorySegment)outPtr.allocate(IID.IDXGIAdapter), (MemorySegment)outPtr.target()
               )
         );
         return new DXGIAdapter(outPtr.result());
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public DXGISwapchain3 createSwapchain(final D3D12CommandQueue commandQueue, final long hwnd, final DXGISwapchainDesc1 description) {
      try (OutPtrHelper outPtr = new OutPtrHelper()) {
         DXUtils.crashIfFailure(
            (int)this.createSwapChainForHwnd
               .invokeExact(
                  (MemorySegment)this.address(),
                  (MemorySegment)commandQueue.address(),
                  (long)hwnd,
                  (MemorySegment)description.address(),
                  (MemorySegment)MemorySegment.NULL,
                  (MemorySegment)MemorySegment.NULL,
                  (MemorySegment)outPtr.target()
               )
         );
         return new DXGISwapchain3(outPtr.result());
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public boolean checkTearingSupport() {
      try (Arena arena = Arena.ofConfined()) {
         MemorySegment boolPtr = arena.allocate(COMUnknown.Types.C_BOOL);
         int result = (int)this.checkFeatureSupport
            .invokeExact((MemorySegment)this.address(), (int)0, (MemorySegment)boolPtr, (int)((int)COMUnknown.Types.C_BOOL.byteSize()));
         return DXUtils.failure(result) ? false : boolPtr.get(COMUnknown.Types.C_BOOL, 0L) != 0;
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }
}

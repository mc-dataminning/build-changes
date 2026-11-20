package com.mojang.renderpearl.util.dx.dxgi;

import com.mojang.renderpearl.util.dx.COMUnknown;
import com.mojang.renderpearl.util.dx.DXUtils;
import com.mojang.renderpearl.util.dx.IID;
import com.mojang.renderpearl.util.dx.OutPtrHelper;
import com.mojang.renderpearl.util.dx.Win32Handle;
import com.mojang.renderpearl.util.dx.d3d12.D3D12Resource;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

public class DXGISwapchain3 extends DXGIDeviceSubObject {
   private final MethodHandle present = this.vtable(
      8L,
      FunctionDescriptor.of(
         COMUnknown.Types.HRESULT, COMUnknown.Types.SELF_PTR, COMUnknown.Types.UINT32.withName("swapInterval"), COMUnknown.Types.UINT32.withName("Flags")
      )
   );
   private final MethodHandle getBuffer = this.vtable(
      9L,
      FunctionDescriptor.of(
         COMUnknown.Types.HRESULT,
         COMUnknown.Types.SELF_PTR,
         COMUnknown.Types.UINT32.withName("bufferIndex"),
         COMUnknown.Types.IID_PTR,
         COMUnknown.Types.COM_OUTPTR.withName("surface")
      )
   );
   private final MethodHandle setMaximumFrameLatency = this.vtable(
      31L, FunctionDescriptor.of(COMUnknown.Types.HRESULT, COMUnknown.Types.SELF_PTR, COMUnknown.Types.UINT32.withName("maxLatency"))
   );
   private final MethodHandle getFrameLatencyWaitableObject = this.vtable(33L, FunctionDescriptor.of(COMUnknown.Types.HANDLE, COMUnknown.Types.SELF_PTR));
   private final MethodHandle getCurrentBackBufferIndex = this.vtable(36L, FunctionDescriptor.of(COMUnknown.Types.UINT32, COMUnknown.Types.SELF_PTR));

   DXGISwapchain3(final MemorySegment address) {
      super(address);
   }

   public int present(final int syncInterval, final int flags) {
      try {
         return (int)this.present.invokeExact((MemorySegment)this.address(), (int)syncInterval, (int)flags);
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public D3D12Resource getBuffer(final int index) {
      try (OutPtrHelper outPtr = new OutPtrHelper()) {
         DXUtils.crashIfFailure(
            (int)this.getBuffer
               .invokeExact((MemorySegment)this.address(), (int)index, (MemorySegment)outPtr.allocate(IID.ID3D12Resource), (MemorySegment)outPtr.target())
         );
         return new D3D12Resource(outPtr.result());
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public int setMaximumLatency(final int latency) {
      try {
         return (int)this.setMaximumFrameLatency.invokeExact((MemorySegment)this.address(), (int)latency);
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public Win32Handle waitHandle() {
      try {
         return new Win32Handle((long)this.getFrameLatencyWaitableObject.invokeExact((MemorySegment)this.address()));
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public int currentBackBufferIndex() {
      try {
         return (int)this.getCurrentBackBufferIndex.invokeExact((MemorySegment)this.address());
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }
}

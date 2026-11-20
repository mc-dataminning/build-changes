package com.mojang.renderpearl.util.dx;

import com.mojang.renderpearl.util.UncheckedAutoCloseable;
import java.lang.foreign.AddressLayout;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.ValueLayout.OfInt;
import java.lang.foreign.ValueLayout.OfLong;
import java.lang.invoke.MethodHandle;
import java.util.Optional;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class COMUnknown implements UncheckedAutoCloseable {
   private static final int MAX_VTABLE_INDEX = 128;
   private static final SymbolLookup SYMBOL_LOOKUP = SymbolLookup.loaderLookup();
   private final MemorySegment address;
   private final MemorySegment vtable;
   private final MethodHandle queryInterface;
   private final MethodHandle release;

   public COMUnknown(final MemorySegment address) {
      this.address = address;
      this.vtable = address.reinterpret(COMUnknown.Types.POINTER.byteSize())
         .get(ValueLayout.ADDRESS, 0L)
         .reinterpret(COMUnknown.Types.POINTER.byteSize() * 128L);
      this.queryInterface = this.vtable(
         0L, FunctionDescriptor.of(COMUnknown.Types.HRESULT, COMUnknown.Types.SELF_PTR, COMUnknown.Types.IID_PTR, COMUnknown.Types.COM_OUTPTR)
      );
      this.release = this.vtable(2L, FunctionDescriptor.of(COMUnknown.Types.UINT32, COMUnknown.Types.SELF_PTR));
   }

   @Override
   public final void close() {
      try {
         this.release.invoke((MemorySegment)this.address);
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public <T extends COMUnknown> @Nullable T queryInterface(final IID iid, final Function<MemorySegment, T> objectConstructor) {
      try (OutPtrHelper outPtr = new OutPtrHelper()) {
         int result = (int)this.queryInterface.invokeExact((MemorySegment)this.address(), (MemorySegment)outPtr.allocate(iid), (MemorySegment)outPtr.target());
         return DXUtils.failure(result) ? null : objectConstructor.apply(outPtr.result());
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }

   public final MemorySegment address() {
      return this.address;
   }

   protected MethodHandle vtable(final long index, final FunctionDescriptor descriptor) {
      if (index < 0L) {
         throw new IllegalArgumentException("Invalid vtable index");
      } else if (index > 128L) {
         throw new IllegalArgumentException("Index too high, increase MAX_VTABLE_INDEX to fix");
      } else {
         return Linker.nativeLinker().downcallHandle(this.vtable.getAtIndex(ValueLayout.ADDRESS, index), descriptor);
      }
   }

   public static MethodHandle loadStaticFunction(final String functionName, final FunctionDescriptor descriptor) {
      Optional<MemorySegment> functionAddress = SYMBOL_LOOKUP.find(functionName);
      if (functionAddress.isEmpty()) {
         throw new IllegalArgumentException("Could not find function " + functionName);
      } else {
         return Linker.nativeLinker().downcallHandle(functionAddress.get(), descriptor);
      }
   }

   protected static class Types {
      public static final AddressLayout POINTER = ValueLayout.ADDRESS;
      public static final AddressLayout SELF_PTR = AddressLayout.ADDRESS.withName("This");
      public static final OfInt HRESULT = ValueLayout.JAVA_INT.withName("HRESULT");
      public static final OfLong HANDLE = ValueLayout.JAVA_LONG;
      public static final OfLong HWND = HANDLE.withName("hwnd");
      public static final AddressLayout IID_PTR = ValueLayout.ADDRESS.withName("iidPtr");
      public static final OfLong UINT64 = ValueLayout.JAVA_LONG;
      public static final OfInt UINT32 = ValueLayout.JAVA_INT;
      public static final OfInt C_ENUM = ValueLayout.JAVA_INT;
      public static final OfInt C_BOOL = ValueLayout.JAVA_INT;
      public static final AddressLayout COM_OUTPTR = AddressLayout.ADDRESS.withTargetLayout(AddressLayout.ADDRESS);
   }
}

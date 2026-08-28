import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.Kernel32Util;
import com.sun.jna.platform.win32.Version;
import com.sun.jna.platform.win32.Win32Exception;
import com.sun.jna.platform.win32.Tlhelp32.MODULEENTRY32W;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class baf {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 65535;
   private static final int c = 1033;
   private static final int d = -65536;
   private static final int e = 78643200;

   public static List<baf.a> a() {
      if (!Platform.isWindows()) {
         return ImmutableList.of();
      } else {
         int $$0 = Kernel32.INSTANCE.GetCurrentProcessId();
         Builder<baf.a> $$1 = ImmutableList.builder();

         for (MODULEENTRY32W $$3 : Kernel32Util.getModules($$0)) {
            String $$4 = $$3.szModule();
            Optional<baf.b> $$5 = a($$3.szExePath());
            $$1.add(new baf.a($$4, $$5));
         }

         return $$1.build();
      }
   }

   private static Optional<baf.b> a(String $$0) {
      try {
         IntByReference $$1 = new IntByReference();
         int $$2 = Version.INSTANCE.GetFileVersionInfoSize($$0, $$1);
         if ($$2 == 0) {
            int $$3 = Native.getLastError();
            if ($$3 != 1813 && $$3 != 1812) {
               throw new Win32Exception($$3);
            } else {
               return Optional.empty();
            }
         } else {
            Pointer $$4 = new Memory((long)$$2);
            if (!Version.INSTANCE.GetFileVersionInfo($$0, 0, $$2, $$4)) {
               throw new Win32Exception(Native.getLastError());
            } else {
               IntByReference $$5 = new IntByReference();
               Pointer $$6 = a($$4, "\\VarFileInfo\\Translation", $$5);
               int[] $$7 = $$6.getIntArray(0L, $$5.getValue() / 4);
               OptionalInt $$8 = a($$7);
               if ($$8.isEmpty()) {
                  return Optional.empty();
               } else {
                  int $$9 = $$8.getAsInt();
                  int $$10 = $$9 & 65535;
                  int $$11 = ($$9 & -65536) >> 16;
                  String $$12 = b($$4, a("FileDescription", $$10, $$11), $$5);
                  String $$13 = b($$4, a("CompanyName", $$10, $$11), $$5);
                  String $$14 = b($$4, a("FileVersion", $$10, $$11), $$5);
                  return Optional.of(new baf.b($$12, $$14, $$13));
               }
            }
         }
      } catch (Exception var14) {
         a.info("Failed to find module info for {}", $$0, var14);
         return Optional.empty();
      }
   }

   private static String a(String $$0, int $$1, int $$2) {
      return String.format(Locale.ROOT, "\\StringFileInfo\\%04x%04x\\%s", $$1, $$2, $$0);
   }

   private static OptionalInt a(int[] $$0) {
      OptionalInt $$1 = OptionalInt.empty();

      for (int $$2 : $$0) {
         if (($$2 & -65536) == 78643200 && ($$2 & 65535) == 1033) {
            return OptionalInt.of($$2);
         }

         $$1 = OptionalInt.of($$2);
      }

      return $$1;
   }

   private static Pointer a(Pointer $$0, String $$1, IntByReference $$2) {
      PointerByReference $$3 = new PointerByReference();
      if (!Version.INSTANCE.VerQueryValue($$0, $$1, $$3, $$2)) {
         throw new UnsupportedOperationException("Can't get version value " + $$1);
      } else {
         return $$3.getValue();
      }
   }

   private static String b(Pointer $$0, String $$1, IntByReference $$2) {
      try {
         Pointer $$3 = a($$0, $$1, $$2);
         byte[] $$4 = $$3.getByteArray(0L, ($$2.getValue() - 1) * 2);
         return new String($$4, StandardCharsets.UTF_16LE);
      } catch (Exception var5) {
         return "";
      }
   }

   public static void a(p $$0) {
      $$0.a("Modules", () -> a().stream().sorted(Comparator.comparing($$0x -> $$0x.a)).map($$0x -> "\n\t\t" + $$0x).collect(Collectors.joining()));
   }

   public static class a {
      public final String a;
      public final Optional<baf.b> b;

      public a(String $$0, Optional<baf.b> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.b.<String>map($$0 -> this.a + ":" + $$0).orElse(this.a);
      }
   }

   public static class b {
      public final String a;
      public final String b;
      public final String c;

      public b(String $$0, String $$1, String $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public String toString() {
         return this.a + ":" + this.b + ":" + this.c;
      }
   }
}

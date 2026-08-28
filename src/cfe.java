import javax.annotation.Nullable;

public class cfe {
   @Nullable
   public static eys a(bus $$0, int $$1, int $$2) {
      boolean $$3 = cff.a($$0, $$1);
      return cfi.a($$0, () -> {
         je $$4 = cfi.a($$0.dV(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static eys a(bus $$0, int $$1, int $$2, eys $$3, double $$4) {
      eys $$5 = $$3.a($$0.dx(), $$0.dz(), $$0.dD());
      boolean $$6 = cff.a($$0, $$1);
      return cfi.a($$0, () -> {
         je $$6x = cfi.a($$0.dV(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static eys a(bus $$0, int $$1, int $$2, eys $$3) {
      eys $$4 = $$0.dq().d($$3);
      boolean $$5 = cff.a($$0, $$1);
      return cfi.a($$0, () -> {
         je $$5x = cfi.a($$0.dV(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static je a(bus $$0, int $$1, boolean $$2, je $$3) {
      je $$4 = cfi.a($$0, $$1, $$0.dV(), $$3);
      return !cff.a($$4, $$0) && !cff.a($$2, $$0, $$4) && !cff.a($$0.P(), $$4) && !cff.b($$0, $$4) ? $$4 : null;
   }
}

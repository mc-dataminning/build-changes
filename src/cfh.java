import javax.annotation.Nullable;

public class cfh {
   @Nullable
   public static eyw a(buv $$0, int $$1, int $$2) {
      boolean $$3 = cfi.a($$0, $$1);
      return cfl.a($$0, () -> {
         jf $$4 = cfl.a($$0.dV(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static eyw a(buv $$0, int $$1, int $$2, eyw $$3, double $$4) {
      eyw $$5 = $$3.a($$0.dx(), $$0.dz(), $$0.dD());
      boolean $$6 = cfi.a($$0, $$1);
      return cfl.a($$0, () -> {
         jf $$6x = cfl.a($$0.dV(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static eyw a(buv $$0, int $$1, int $$2, eyw $$3) {
      eyw $$4 = $$0.dq().d($$3);
      boolean $$5 = cfi.a($$0, $$1);
      return cfl.a($$0, () -> {
         jf $$5x = cfl.a($$0.dV(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static jf a(buv $$0, int $$1, boolean $$2, jf $$3) {
      jf $$4 = cfl.a($$0, $$1, $$0.dV(), $$3);
      return !cfi.a($$4, $$0) && !cfi.a($$2, $$0, $$4) && !cfi.a($$0.P(), $$4) && !cfi.b($$0, $$4) ? $$4 : null;
   }
}

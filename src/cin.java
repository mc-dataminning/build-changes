import javax.annotation.Nullable;

public class cin {
   @Nullable
   public static ffq a(byc $$0, int $$1, int $$2) {
      boolean $$3 = cio.a($$0, $$1);
      return cir.a($$0, () -> {
         iv $$4 = cir.a($$0.dY(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ffq a(byc $$0, int $$1, int $$2, ffq $$3, double $$4) {
      ffq $$5 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$6 = cio.a($$0, $$1);
      return cir.a($$0, () -> {
         iv $$6x = cir.a($$0.dY(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ffq a(byc $$0, int $$1, int $$2, ffq $$3) {
      ffq $$4 = $$0.dt().d($$3);
      boolean $$5 = cio.a($$0, $$1);
      return cir.a($$0, () -> {
         iv $$5x = cir.a($$0.dY(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static iv a(byc $$0, int $$1, boolean $$2, iv $$3) {
      iv $$4 = cir.a($$0, $$1, $$0.dY(), $$3);
      return !cio.a($$4, $$0) && !cio.a($$2, $$0, $$4) && !cio.a($$0.O(), $$4) && !cio.b($$0, $$4) ? $$4 : null;
   }
}

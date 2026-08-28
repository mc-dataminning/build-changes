import javax.annotation.Nullable;

public class cgc {
   @Nullable
   public static fba a(bvp $$0, int $$1, int $$2) {
      boolean $$3 = cgd.a($$0, $$1);
      return cgg.a($$0, () -> {
         ji $$4 = cgg.a($$0.dY(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static fba a(bvp $$0, int $$1, int $$2, fba $$3, double $$4) {
      fba $$5 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$6 = cgd.a($$0, $$1);
      return cgg.a($$0, () -> {
         ji $$6x = cgg.a($$0.dY(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static fba a(bvp $$0, int $$1, int $$2, fba $$3) {
      fba $$4 = $$0.dt().d($$3);
      boolean $$5 = cgd.a($$0, $$1);
      return cgg.a($$0, () -> {
         ji $$5x = cgg.a($$0.dY(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static ji a(bvp $$0, int $$1, boolean $$2, ji $$3) {
      ji $$4 = cgg.a($$0, $$1, $$0.dY(), $$3);
      return !cgd.a($$4, $$0) && !cgd.a($$2, $$0, $$4) && !cgd.a($$0.P(), $$4) && !cgd.b($$0, $$4) ? $$4 : null;
   }
}

import javax.annotation.Nullable;

public class cgb {
   @Nullable
   public static faz a(bvo $$0, int $$1, int $$2) {
      boolean $$3 = cgc.a($$0, $$1);
      return cgf.a($$0, () -> {
         ji $$4 = cgf.a($$0.dY(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static faz a(bvo $$0, int $$1, int $$2, faz $$3, double $$4) {
      faz $$5 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$6 = cgc.a($$0, $$1);
      return cgf.a($$0, () -> {
         ji $$6x = cgf.a($$0.dY(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static faz a(bvo $$0, int $$1, int $$2, faz $$3) {
      faz $$4 = $$0.dt().d($$3);
      boolean $$5 = cgc.a($$0, $$1);
      return cgf.a($$0, () -> {
         ji $$5x = cgf.a($$0.dY(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static ji a(bvo $$0, int $$1, boolean $$2, ji $$3) {
      ji $$4 = cgf.a($$0, $$1, $$0.dY(), $$3);
      return !cgc.a($$4, $$0) && !cgc.a($$2, $$0, $$4) && !cgc.a($$0.P(), $$4) && !cgc.b($$0, $$4) ? $$4 : null;
   }
}

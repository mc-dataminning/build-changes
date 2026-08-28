import javax.annotation.Nullable;

public class cgd {
   @Nullable
   public static fbb a(bvq $$0, int $$1, int $$2) {
      boolean $$3 = cge.a($$0, $$1);
      return cgh.a($$0, () -> {
         ji $$4 = cgh.a($$0.dY(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static fbb a(bvq $$0, int $$1, int $$2, fbb $$3, double $$4) {
      fbb $$5 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$6 = cge.a($$0, $$1);
      return cgh.a($$0, () -> {
         ji $$6x = cgh.a($$0.dY(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static fbb a(bvq $$0, int $$1, int $$2, fbb $$3) {
      fbb $$4 = $$0.dt().d($$3);
      boolean $$5 = cge.a($$0, $$1);
      return cgh.a($$0, () -> {
         ji $$5x = cgh.a($$0.dY(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static ji a(bvq $$0, int $$1, boolean $$2, ji $$3) {
      ji $$4 = cgh.a($$0, $$1, $$0.dY(), $$3);
      return !cge.a($$4, $$0) && !cge.a($$2, $$0, $$4) && !cge.a($$0.P(), $$4) && !cge.b($$0, $$4) ? $$4 : null;
   }
}

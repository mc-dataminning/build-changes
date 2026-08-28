import javax.annotation.Nullable;

public class cgf {
   @Nullable
   public static fbb a(bvq $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cge.a($$0, $$1);
      return cgh.a($$0, () -> {
         ji $$9 = cgh.a($$0.dY(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            ji $$10 = cgg.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cgh.a($$10, $$0.dY().a($$6 - $$7 + 1) + $$7, $$0.dV().an(), $$1xx -> cge.c($$0, $$1xx));
               return !cge.a($$0, $$10) && !cge.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

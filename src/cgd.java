import javax.annotation.Nullable;

public class cgd {
   @Nullable
   public static faz a(bvo $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cgc.a($$0, $$1);
      return cgf.a($$0, () -> {
         ji $$9 = cgf.a($$0.dY(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            ji $$10 = cge.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cgf.a($$10, $$0.dY().a($$6 - $$7 + 1) + $$7, $$0.dV().an(), $$1xx -> cgc.c($$0, $$1xx));
               return !cgc.a($$0, $$10) && !cgc.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

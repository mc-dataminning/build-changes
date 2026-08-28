import javax.annotation.Nullable;

public class cfs {
   @Nullable
   public static ezh a(bvd $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cfr.a($$0, $$1);
      return cfu.a($$0, () -> {
         jg $$9 = cfu.a($$0.ea(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            jg $$10 = cft.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cfu.a($$10, $$0.ea().a($$6 - $$7 + 1) + $$7, $$0.dX().an(), $$1xx -> cfr.c($$0, $$1xx));
               return !cfr.a($$0, $$10) && !cfr.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

import javax.annotation.Nullable;

public class bvq {
   @Nullable
   public static eji a(blh $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = bvp.a($$0, $$1);
      return bvs.a($$0, () -> {
         ht $$9 = bvs.a($$0.ef(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            ht $$10 = bvr.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = bvs.a($$10, $$0.ef().a($$6 - $$7 + 1) + $$7, $$0.dL().aj(), $$1xx -> bvp.c($$0, $$1xx));
               return !bvp.a($$0, $$10) && !bvp.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

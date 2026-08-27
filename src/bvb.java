import javax.annotation.Nullable;

public class bvb {
   @Nullable
   public static eif a(bks $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = bva.a($$0, $$1);
      return bvd.a($$0, () -> {
         ht $$9 = bvd.a($$0.ef(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            ht $$10 = bvc.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = bvd.a($$10, $$0.ef().a($$6 - $$7 + 1) + $$7, $$0.dL().aj(), $$1xx -> bva.c($$0, $$1xx));
               return !bva.a($$0, $$10) && !bva.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

import javax.annotation.Nullable;

public class bqs {
   @Nullable
   public static eei a(bgi $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = bqr.a($$0, $$1);
      return bqu.a($$0, () -> {
         gu $$9 = bqu.a($$0.ec(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            gu $$10 = bqt.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = bqu.a($$10, $$0.ec().a($$6 - $$7 + 1) + $$7, $$0.dI().aj(), $$1xx -> bqr.c($$0, $$1xx));
               return !bqr.a($$0, $$10) && !bqr.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

import javax.annotation.Nullable;

public class btt {
   @Nullable
   public static ehi a(bjk $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = bts.a($$0, $$1);
      return btv.a($$0, () -> {
         gw $$9 = btv.a($$0.ee(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            gw $$10 = btu.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = btv.a($$10, $$0.ee().a($$6 - $$7 + 1) + $$7, $$0.dK().aj(), $$1xx -> bts.c($$0, $$1xx));
               return !bts.a($$0, $$10) && !bts.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

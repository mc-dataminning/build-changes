import javax.annotation.Nullable;

public class btp {
   @Nullable
   public static ehi a(bjk $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = bts.a($$0, $$1);
      return btv.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static gw a(bjk $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      gw $$8 = btv.a($$0.ee(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         gw $$9 = btv.a($$0, $$1, $$0.ee(), $$8);
         if (!bts.a($$9, $$0) && !bts.a($$7, $$0, $$9)) {
            $$9 = btv.a($$9, $$0.dK().aj(), $$1x -> bts.c($$0, $$1x));
            return bts.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

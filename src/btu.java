import javax.annotation.Nullable;

public class btu {
   @Nullable
   public static ehn a(bjp $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = btx.a($$0, $$1);
      return bua.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static gw a(bjp $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      gw $$8 = bua.a($$0.ef(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         gw $$9 = bua.a($$0, $$1, $$0.ef(), $$8);
         if (!btx.a($$9, $$0) && !btx.a($$7, $$0, $$9)) {
            $$9 = bua.a($$9, $$0.dL().aj(), $$1x -> btx.c($$0, $$1x));
            return btx.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

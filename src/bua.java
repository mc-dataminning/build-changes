import javax.annotation.Nullable;

public class bua {
   @Nullable
   public static ehp a(bjr $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = btz.a($$0, $$1);
      return buc.a($$0, () -> {
         gw $$9 = buc.a($$0.ef(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            gw $$10 = bub.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = buc.a($$10, $$0.ef().a($$6 - $$7 + 1) + $$7, $$0.dL().aj(), $$1xx -> btz.c($$0, $$1xx));
               return !btz.a($$0, $$10) && !btz.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

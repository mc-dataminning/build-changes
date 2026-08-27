import javax.annotation.Nullable;

public class ccw {
   @Nullable
   public static etp a(bsi $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = ccv.a($$0, $$1);
      return ccy.a($$0, () -> {
         in $$9 = ccy.a($$0.ej(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            in $$10 = ccx.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = ccy.a($$10, $$0.ej().a($$6 - $$7 + 1) + $$7, $$0.dN().al(), $$1xx -> ccv.c($$0, $$1xx));
               return !ccv.a($$0, $$10) && !ccv.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

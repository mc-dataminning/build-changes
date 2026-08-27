import javax.annotation.Nullable;

public class ccs {
   @Nullable
   public static etp a(bsi $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = ccv.a($$0, $$1);
      return ccy.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static in a(bsi $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      in $$8 = ccy.a($$0.ej(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         in $$9 = ccy.a($$0, $$1, $$0.ej(), $$8);
         if (!ccv.a($$9, $$0) && !ccv.a($$7, $$0, $$9)) {
            $$9 = ccy.a($$9, $$0.dN().al(), $$1x -> ccv.c($$0, $$1x));
            return ccv.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

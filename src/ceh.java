import javax.annotation.Nullable;

public class ceh {
   @Nullable
   public static evm a(btt $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = ceg.a($$0, $$1);
      return cej.a($$0, () -> {
         iz $$9 = cej.a($$0.el(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            iz $$10 = cei.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cej.a($$10, $$0.el().a($$6 - $$7 + 1) + $$7, $$0.dP().am(), $$1xx -> ceg.c($$0, $$1xx));
               return !ceg.a($$0, $$10) && !ceg.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

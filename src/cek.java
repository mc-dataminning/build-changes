import javax.annotation.Nullable;

public class cek {
   @Nullable
   public static evp a(btw $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cej.a($$0, $$1);
      return cem.a($$0, () -> {
         iz $$9 = cem.a($$0.el(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            iz $$10 = cel.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cem.a($$10, $$0.el().a($$6 - $$7 + 1) + $$7, $$0.dP().am(), $$1xx -> cej.c($$0, $$1xx));
               return !cej.a($$0, $$10) && !cej.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

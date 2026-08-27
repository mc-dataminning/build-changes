import javax.annotation.Nullable;

public class cca {
   @Nullable
   public static etf a(brm $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cbz.a($$0, $$1);
      return ccc.a($$0, () -> {
         im $$9 = ccc.a($$0.ej(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            im $$10 = ccb.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = ccc.a($$10, $$0.ej().a($$6 - $$7 + 1) + $$7, $$0.dN().al(), $$1xx -> cbz.c($$0, $$1xx));
               return !cbz.a($$0, $$10) && !cbz.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

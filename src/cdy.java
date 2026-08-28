import javax.annotation.Nullable;

public class cdy {
   @Nullable
   public static ewf a(btk $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cdx.a($$0, $$1);
      return cea.a($$0, () -> {
         ja $$9 = cea.a($$0.dT(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            ja $$10 = cdz.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cea.a($$10, $$0.dT().a($$6 - $$7 + 1) + $$7, $$0.dQ().am(), $$1xx -> cdx.c($$0, $$1xx));
               return !cdx.a($$0, $$10) && !cdx.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

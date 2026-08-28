import javax.annotation.Nullable;

public class cdz {
   @Nullable
   public static ewh a(btl $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cdy.a($$0, $$1);
      return ceb.a($$0, () -> {
         ja $$9 = ceb.a($$0.dU(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            ja $$10 = cea.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = ceb.a($$10, $$0.dU().a($$6 - $$7 + 1) + $$7, $$0.dR().am(), $$1xx -> cdy.c($$0, $$1xx));
               return !cdy.a($$0, $$10) && !cdy.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

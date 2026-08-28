import javax.annotation.Nullable;

public class cip {
   @Nullable
   public static ffq a(byc $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cio.a($$0, $$1);
      return cir.a($$0, () -> {
         iv $$9 = cir.a($$0.dY(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            iv $$10 = ciq.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cir.a($$10, $$0.dY().a($$6 - $$7 + 1) + $$7, $$0.dV().ao(), $$1xx -> cio.c($$0, $$1xx));
               return !cio.a($$0, $$10) && !cio.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

import javax.annotation.Nullable;

public class cie {
   @Nullable
   public static ffc a(bxr $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cid.a($$0, $$1);
      return cig.a($$0, () -> {
         iv $$9 = cig.a($$0.dX(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            iv $$10 = cif.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cig.a($$10, $$0.dX().a($$6 - $$7 + 1) + $$7, $$0.dU().ao(), $$1xx -> cid.c($$0, $$1xx));
               return !cid.a($$0, $$10) && !cid.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

import javax.annotation.Nullable;

public class cak {
   @Nullable
   public static epr a(bpw $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = caj.a($$0, $$1);
      return cam.a($$0, () -> {
         ib $$9 = cam.a($$0.ei(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            ib $$10 = cal.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cam.a($$10, $$0.ei().a($$6 - $$7 + 1) + $$7, $$0.dM().ak(), $$1xx -> caj.c($$0, $$1xx));
               return !caj.a($$0, $$10) && !caj.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

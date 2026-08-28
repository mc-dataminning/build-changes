import javax.annotation.Nullable;

public class cel {
   @Nullable
   public static exa a(btw $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cek.a($$0, $$1);
      return cen.a($$0, () -> {
         jd $$9 = cen.a($$0.dS(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            jd $$10 = cem.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cen.a($$10, $$0.dS().a($$6 - $$7 + 1) + $$7, $$0.dP().am(), $$1xx -> cek.c($$0, $$1xx));
               return !cek.a($$0, $$10) && !cek.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

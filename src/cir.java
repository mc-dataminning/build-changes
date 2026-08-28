import javax.annotation.Nullable;

public class cir {
   @Nullable
   public static ffs a(bye $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = ciq.a($$0, $$1);
      return cit.a($$0, () -> {
         iw $$9 = cit.a($$0.dY(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            iw $$10 = cis.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cit.a($$10, $$0.dY().a($$6 - $$7 + 1) + $$7, $$0.dV().ao(), $$1xx -> ciq.c($$0, $$1xx));
               return !ciq.a($$0, $$10) && !ciq.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

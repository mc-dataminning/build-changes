import javax.annotation.Nullable;

public class cdv {
   @Nullable
   public static evz a(bth $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cdu.a($$0, $$1);
      return cdx.a($$0, () -> {
         ja $$9 = cdx.a($$0.dS(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            ja $$10 = cdw.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cdx.a($$10, $$0.dS().a($$6 - $$7 + 1) + $$7, $$0.dP().am(), $$1xx -> cdu.c($$0, $$1xx));
               return !cdu.a($$0, $$10) && !cdu.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

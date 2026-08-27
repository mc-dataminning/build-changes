import javax.annotation.Nullable;

public class cdn {
   @Nullable
   public static eum a(bsz $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cdm.a($$0, $$1);
      return cdp.a($$0, () -> {
         io $$9 = cdp.a($$0.el(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            io $$10 = cdo.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cdp.a($$10, $$0.el().a($$6 - $$7 + 1) + $$7, $$0.dP().al(), $$1xx -> cdm.c($$0, $$1xx));
               return !cdm.a($$0, $$10) && !cdm.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

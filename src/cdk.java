import javax.annotation.Nullable;

public class cdk {
   @Nullable
   public static ewu a(bsw $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cdj.a($$0, $$1);
      return cdm.a($$0, () -> {
         ir $$9 = cdm.a($$0.et(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            ir $$10 = cdl.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cdm.a($$10, $$0.et().a($$6 - $$7 + 1) + $$7, $$0.dU().am(), $$1xx -> cdj.c($$0, $$1xx));
               return !cdj.a($$0, $$10) && !cdj.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

import javax.annotation.Nullable;

public class cdl {
   @Nullable
   public static euk a(bsx $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cdk.a($$0, $$1);
      return cdn.a($$0, () -> {
         io $$9 = cdn.a($$0.el(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            io $$10 = cdm.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cdn.a($$10, $$0.el().a($$6 - $$7 + 1) + $$7, $$0.dP().al(), $$1xx -> cdk.c($$0, $$1xx));
               return !cdk.a($$0, $$10) && !cdk.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

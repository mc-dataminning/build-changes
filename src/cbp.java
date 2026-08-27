import javax.annotation.Nullable;

public class cbp {
   @Nullable
   public static esj a(brb $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cbo.a($$0, $$1);
      return cbr.a($$0, () -> {
         id $$9 = cbr.a($$0.ei(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            id $$10 = cbq.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cbr.a($$10, $$0.ei().a($$6 - $$7 + 1) + $$7, $$0.dM().al(), $$1xx -> cbo.c($$0, $$1xx));
               return !cbo.a($$0, $$10) && !cbo.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

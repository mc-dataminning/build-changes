import javax.annotation.Nullable;

public class cbk {
   @Nullable
   public static esa a(bqw $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cbj.a($$0, $$1);
      return cbm.a($$0, () -> {
         ib $$9 = cbm.a($$0.ei(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            ib $$10 = cbl.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cbm.a($$10, $$0.ei().a($$6 - $$7 + 1) + $$7, $$0.dM().al(), $$1xx -> cbj.c($$0, $$1xx));
               return !cbj.a($$0, $$10) && !cbj.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

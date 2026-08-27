import javax.annotation.Nullable;

public class bza {
   @Nullable
   public static ens a(boo $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = byz.a($$0, $$1);
      return bzc.a($$0, () -> {
         hz $$9 = bzc.a($$0.eh(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            hz $$10 = bzb.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = bzc.a($$10, $$0.eh().a($$6 - $$7 + 1) + $$7, $$0.dM().al(), $$1xx -> byz.c($$0, $$1xx));
               return !byz.a($$0, $$10) && !byz.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

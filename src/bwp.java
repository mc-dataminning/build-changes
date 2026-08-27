import javax.annotation.Nullable;

public class bwp {
   @Nullable
   public static elb a(bme $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = bwo.a($$0, $$1);
      return bwr.a($$0, () -> {
         hv $$9 = bwr.a($$0.eg(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            hv $$10 = bwq.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = bwr.a($$10, $$0.eg().a($$6 - $$7 + 1) + $$7, $$0.dM().ak(), $$1xx -> bwo.c($$0, $$1xx));
               return !bwo.a($$0, $$10) && !bwo.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

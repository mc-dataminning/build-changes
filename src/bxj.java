import javax.annotation.Nullable;

public class bxj {
   @Nullable
   public static emc a(bmx $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = bxi.a($$0, $$1);
      return bxl.a($$0, () -> {
         hx $$9 = bxl.a($$0.eg(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            hx $$10 = bxk.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = bxl.a($$10, $$0.eg().a($$6 - $$7 + 1) + $$7, $$0.dL().al(), $$1xx -> bxi.c($$0, $$1xx));
               return !bxi.a($$0, $$10) && !bxi.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

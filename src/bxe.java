import javax.annotation.Nullable;

public class bxe {
   @Nullable
   public static els a(bmt $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = bxd.a($$0, $$1);
      return bxg.a($$0, () -> {
         hx $$9 = bxg.a($$0.eg(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            hx $$10 = bxf.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = bxg.a($$10, $$0.eg().a($$6 - $$7 + 1) + $$7, $$0.dM().al(), $$1xx -> bxd.c($$0, $$1xx));
               return !bxd.a($$0, $$10) && !bxd.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

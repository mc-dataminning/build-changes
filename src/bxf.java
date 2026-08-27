import javax.annotation.Nullable;

public class bxf {
   @Nullable
   public static elt a(bmu $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = bxe.a($$0, $$1);
      return bxh.a($$0, () -> {
         hx $$9 = bxh.a($$0.eg(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            hx $$10 = bxg.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = bxh.a($$10, $$0.eg().a($$6 - $$7 + 1) + $$7, $$0.dM().al(), $$1xx -> bxe.c($$0, $$1xx));
               return !bxe.a($$0, $$10) && !bxe.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

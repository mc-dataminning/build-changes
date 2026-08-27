import javax.annotation.Nullable;

public class bwz {
   @Nullable
   public static elm a(bmo $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = bwy.a($$0, $$1);
      return bxb.a($$0, () -> {
         hx $$9 = bxb.a($$0.eg(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            hx $$10 = bxa.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = bxb.a($$10, $$0.eg().a($$6 - $$7 + 1) + $$7, $$0.dM().al(), $$1xx -> bwy.c($$0, $$1xx));
               return !bwy.a($$0, $$10) && !bwy.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

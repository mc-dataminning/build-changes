import javax.annotation.Nullable;

public class bwd {
   @Nullable
   public static ejz a(blu $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = bwc.a($$0, $$1);
      return bwf.a($$0, () -> {
         hx $$9 = bwf.a($$0.eh(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            hx $$10 = bwe.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = bwf.a($$10, $$0.eh().a($$6 - $$7 + 1) + $$7, $$0.dN().ak(), $$1xx -> bwc.c($$0, $$1xx));
               return !bwc.a($$0, $$10) && !bwc.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

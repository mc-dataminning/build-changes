import javax.annotation.Nullable;

public class btp {
   @Nullable
   public static ehf a(bjf $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = bto.a($$0, $$1);
      return btr.a($$0, () -> {
         gv $$9 = btr.a($$0.ee(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            gv $$10 = btq.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = btr.a($$10, $$0.ee().a($$6 - $$7 + 1) + $$7, $$0.dK().aj(), $$1xx -> bto.c($$0, $$1xx));
               return !bto.a($$0, $$10) && !bto.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

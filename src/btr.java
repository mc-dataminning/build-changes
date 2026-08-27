import javax.annotation.Nullable;

public class btr {
   @Nullable
   public static ehe a(bjh $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = btq.a($$0, $$1);
      return btt.a($$0, () -> {
         gu $$9 = btt.a($$0.ee(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            gu $$10 = bts.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = btt.a($$10, $$0.ee().a($$6 - $$7 + 1) + $$7, $$0.dK().aj(), $$1xx -> btq.c($$0, $$1xx));
               return !btq.a($$0, $$10) && !btq.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

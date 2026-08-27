import javax.annotation.Nullable;

public class btq {
   @Nullable
   public static ehd a(bjh $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = btp.a($$0, $$1);
      return bts.a($$0, () -> {
         gu $$9 = bts.a($$0.ee(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            gu $$10 = btr.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = bts.a($$10, $$0.ee().a($$6 - $$7 + 1) + $$7, $$0.dK().aj(), $$1xx -> btp.c($$0, $$1xx));
               return !btp.a($$0, $$10) && !btp.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

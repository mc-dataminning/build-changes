import javax.annotation.Nullable;

public class bqo {
   @Nullable
   public static eei a(bgi $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = bqr.a($$0, $$1);
      return bqu.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static gu a(bgi $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      gu $$8 = bqu.a($$0.ec(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         gu $$9 = bqu.a($$0, $$1, $$0.ec(), $$8);
         if (!bqr.a($$9, $$0) && !bqr.a($$7, $$0, $$9)) {
            $$9 = bqu.a($$9, $$0.dI().aj(), $$1x -> bqr.c($$0, $$1x));
            return bqr.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

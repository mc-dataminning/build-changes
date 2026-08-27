import javax.annotation.Nullable;

public class btn {
   @Nullable
   public static ehe a(bjh $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = btq.a($$0, $$1);
      return btt.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static gu a(bjh $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      gu $$8 = btt.a($$0.ee(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         gu $$9 = btt.a($$0, $$1, $$0.ee(), $$8);
         if (!btq.a($$9, $$0) && !btq.a($$7, $$0, $$9)) {
            $$9 = btt.a($$9, $$0.dK().aj(), $$1x -> btq.c($$0, $$1x));
            return btq.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

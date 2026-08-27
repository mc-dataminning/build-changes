import javax.annotation.Nullable;

public class btm {
   @Nullable
   public static ehd a(bjh $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = btp.a($$0, $$1);
      return bts.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static gu a(bjh $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      gu $$8 = bts.a($$0.ee(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         gu $$9 = bts.a($$0, $$1, $$0.ee(), $$8);
         if (!btp.a($$9, $$0) && !btp.a($$7, $$0, $$9)) {
            $$9 = bts.a($$9, $$0.dK().aj(), $$1x -> btp.c($$0, $$1x));
            return btp.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

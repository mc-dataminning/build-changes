import javax.annotation.Nullable;

public class cgy {
   @Nullable
   public static fbs a(bwj $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cgx.a($$0, $$1);
      return cha.a($$0, () -> {
         jh $$9 = cha.a($$0.dY(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            jh $$10 = cgz.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cha.a($$10, $$0.dY().a($$6 - $$7 + 1) + $$7, $$0.dV().am(), $$1xx -> cgx.c($$0, $$1xx));
               return !cgx.a($$0, $$10) && !cgx.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

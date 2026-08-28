import javax.annotation.Nullable;

public class chd {
   @Nullable
   public static fby a(bwo $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = chc.a($$0, $$1);
      return chf.a($$0, () -> {
         jh $$9 = chf.a($$0.dZ(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            jh $$10 = che.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = chf.a($$10, $$0.dZ().a($$6 - $$7 + 1) + $$7, $$0.dW().am(), $$1xx -> chc.c($$0, $$1xx));
               return !chc.a($$0, $$10) && !chc.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

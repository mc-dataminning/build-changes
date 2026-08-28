import javax.annotation.Nullable;

public class cgz {
   @Nullable
   public static fby a(bwo $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = chc.a($$0, $$1);
      return chf.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static jh a(bwo $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      jh $$8 = chf.a($$0.dZ(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         jh $$9 = chf.a($$0, $$1, $$0.dZ(), $$8);
         if (!chc.a($$9, $$0) && !chc.a($$7, $$0, $$9)) {
            $$9 = chf.a($$9, $$0.dW().am(), $$1x -> chc.c($$0, $$1x));
            return chc.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

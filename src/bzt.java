import javax.annotation.Nullable;

public class bzt {
   @Nullable
   public static eov a(bpf $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = bzs.a($$0, $$1);
      return bzv.a($$0, () -> {
         ib $$9 = bzv.a($$0.ef(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            ib $$10 = bzu.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = bzv.a($$10, $$0.ef().a($$6 - $$7 + 1) + $$7, $$0.dJ().ak(), $$1xx -> bzs.c($$0, $$1xx));
               return !bzs.a($$0, $$10) && !bzs.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

import javax.annotation.Nullable;

public class bzp {
   @Nullable
   public static eov a(bpf $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = bzs.a($$0, $$1);
      return bzv.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static ib a(bpf $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      ib $$8 = bzv.a($$0.ef(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         ib $$9 = bzv.a($$0, $$1, $$0.ef(), $$8);
         if (!bzs.a($$9, $$0) && !bzs.a($$7, $$0, $$9)) {
            $$9 = bzv.a($$9, $$0.dJ().ak(), $$1x -> bzs.c($$0, $$1x));
            return bzs.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

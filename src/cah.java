import javax.annotation.Nullable;

public class cah {
   @Nullable
   public static ept a(bpx $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cak.a($$0, $$1);
      return can.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static ib a(bpx $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      ib $$8 = can.a($$0.ei(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         ib $$9 = can.a($$0, $$1, $$0.ei(), $$8);
         if (!cak.a($$9, $$0) && !cak.a($$7, $$0, $$9)) {
            $$9 = can.a($$9, $$0.dM().ak(), $$1x -> cak.c($$0, $$1x));
            return cak.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

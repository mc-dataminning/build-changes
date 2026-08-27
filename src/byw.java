import javax.annotation.Nullable;

public class byw {
   @Nullable
   public static ens a(boo $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = byz.a($$0, $$1);
      return bzc.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static hz a(boo $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      hz $$8 = bzc.a($$0.eh(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         hz $$9 = bzc.a($$0, $$1, $$0.eh(), $$8);
         if (!byz.a($$9, $$0) && !byz.a($$7, $$0, $$9)) {
            $$9 = bzc.a($$9, $$0.dM().al(), $$1x -> byz.c($$0, $$1x));
            return byz.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

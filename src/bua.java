import javax.annotation.Nullable;

public class bua {
   @Nullable
   public static ehh a(bjv $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = bud.a($$0, $$1);
      return bug.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static gw a(bjv $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      gw $$8 = bug.a($$0.ef(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         gw $$9 = bug.a($$0, $$1, $$0.ef(), $$8);
         if (!bud.a($$9, $$0) && !bud.a($$7, $$0, $$9)) {
            $$9 = bug.a($$9, $$0.dL().aj(), $$1x -> bud.c($$0, $$1x));
            return bud.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

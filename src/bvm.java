import javax.annotation.Nullable;

public class bvm {
   @Nullable
   public static eji a(blh $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = bvp.a($$0, $$1);
      return bvs.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static ht a(blh $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      ht $$8 = bvs.a($$0.ef(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         ht $$9 = bvs.a($$0, $$1, $$0.ef(), $$8);
         if (!bvp.a($$9, $$0) && !bvp.a($$7, $$0, $$9)) {
            $$9 = bvs.a($$9, $$0.dL().aj(), $$1x -> bvp.c($$0, $$1x));
            return bvp.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

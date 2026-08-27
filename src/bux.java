import javax.annotation.Nullable;

public class bux {
   @Nullable
   public static eif a(bks $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = bva.a($$0, $$1);
      return bvd.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static ht a(bks $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      ht $$8 = bvd.a($$0.ef(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         ht $$9 = bvd.a($$0, $$1, $$0.ef(), $$8);
         if (!bva.a($$9, $$0) && !bva.a($$7, $$0, $$9)) {
            $$9 = bvd.a($$9, $$0.dL().aj(), $$1x -> bva.c($$0, $$1x));
            return bva.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

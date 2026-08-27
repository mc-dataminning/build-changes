import javax.annotation.Nullable;

public class bvu {
   @Nullable
   public static eju a(blp $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = bvx.a($$0, $$1);
      return bwa.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static ht a(blp $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      ht $$8 = bwa.a($$0.eh(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         ht $$9 = bwa.a($$0, $$1, $$0.eh(), $$8);
         if (!bvx.a($$9, $$0) && !bvx.a($$7, $$0, $$9)) {
            $$9 = bwa.a($$9, $$0.dN().ak(), $$1x -> bvx.c($$0, $$1x));
            return bvx.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

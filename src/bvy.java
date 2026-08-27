import javax.annotation.Nullable;

public class bvy {
   @Nullable
   public static eju a(blp $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = bvx.a($$0, $$1);
      return bwa.a($$0, () -> {
         ht $$9 = bwa.a($$0.eh(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            ht $$10 = bvz.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = bwa.a($$10, $$0.eh().a($$6 - $$7 + 1) + $$7, $$0.dN().ak(), $$1xx -> bvx.c($$0, $$1xx));
               return !bvx.a($$0, $$10) && !bvx.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

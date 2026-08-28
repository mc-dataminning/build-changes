import javax.annotation.Nullable;

public class cgb {
   @Nullable
   public static fbb a(bvq $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cge.a($$0, $$1);
      return cgh.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static ji a(bvq $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      ji $$8 = cgh.a($$0.dY(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         ji $$9 = cgh.a($$0, $$1, $$0.dY(), $$8);
         if (!cge.a($$9, $$0) && !cge.a($$7, $$0, $$9)) {
            $$9 = cgh.a($$9, $$0.dV().an(), $$1x -> cge.c($$0, $$1x));
            return cge.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

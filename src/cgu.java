import javax.annotation.Nullable;

public class cgu {
   @Nullable
   public static fbr a(bwf $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cgt.a($$0, $$1);
      return cgw.a($$0, () -> {
         jh $$9 = cgw.a($$0.dZ(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            jh $$10 = cgv.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cgw.a($$10, $$0.dZ().a($$6 - $$7 + 1) + $$7, $$0.dW().an(), $$1xx -> cgt.c($$0, $$1xx));
               return !cgt.a($$0, $$10) && !cgt.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

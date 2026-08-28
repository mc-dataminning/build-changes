import javax.annotation.Nullable;

public class cfj {
   @Nullable
   public static eyw a(buv $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cfi.a($$0, $$1);
      return cfl.a($$0, () -> {
         jf $$9 = cfl.a($$0.dV(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            jf $$10 = cfk.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cfl.a($$10, $$0.dV().a($$6 - $$7 + 1) + $$7, $$0.dS().an(), $$1xx -> cfi.c($$0, $$1xx));
               return !cfi.a($$0, $$10) && !cfi.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

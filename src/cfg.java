import javax.annotation.Nullable;

public class cfg {
   @Nullable
   public static eys a(bus $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cff.a($$0, $$1);
      return cfi.a($$0, () -> {
         je $$9 = cfi.a($$0.dV(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            je $$10 = cfh.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cfi.a($$10, $$0.dV().a($$6 - $$7 + 1) + $$7, $$0.dS().an(), $$1xx -> cff.c($$0, $$1xx));
               return !cff.a($$0, $$10) && !cff.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

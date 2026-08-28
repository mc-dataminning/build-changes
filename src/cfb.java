import javax.annotation.Nullable;

public class cfb {
   @Nullable
   public static eye a(bun $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cfa.a($$0, $$1);
      return cfd.a($$0, () -> {
         je $$9 = cfd.a($$0.dV(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            je $$10 = cfc.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cfd.a($$10, $$0.dV().a($$6 - $$7 + 1) + $$7, $$0.dS().an(), $$1xx -> cfa.c($$0, $$1xx));
               return !cfa.a($$0, $$10) && !cfa.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

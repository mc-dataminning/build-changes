import javax.annotation.Nullable;

public class cex {
   @Nullable
   public static eye a(bun $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cfa.a($$0, $$1);
      return cfd.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static je a(bun $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      je $$8 = cfd.a($$0.dV(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         je $$9 = cfd.a($$0, $$1, $$0.dV(), $$8);
         if (!cfa.a($$9, $$0) && !cfa.a($$7, $$0, $$9)) {
            $$9 = cfd.a($$9, $$0.dS().an(), $$1x -> cfa.c($$0, $$1x));
            return cfa.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

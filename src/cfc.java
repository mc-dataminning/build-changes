import javax.annotation.Nullable;

public class cfc {
   @Nullable
   public static eys a(bus $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cff.a($$0, $$1);
      return cfi.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static je a(bus $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      je $$8 = cfi.a($$0.dV(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         je $$9 = cfi.a($$0, $$1, $$0.dV(), $$8);
         if (!cff.a($$9, $$0) && !cff.a($$7, $$0, $$9)) {
            $$9 = cfi.a($$9, $$0.dS().an(), $$1x -> cff.c($$0, $$1x));
            return cff.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

import javax.annotation.Nullable;

public class cff {
   @Nullable
   public static eyw a(buv $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cfi.a($$0, $$1);
      return cfl.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static jf a(buv $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      jf $$8 = cfl.a($$0.dV(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         jf $$9 = cfl.a($$0, $$1, $$0.dV(), $$8);
         if (!cfi.a($$9, $$0) && !cfi.a($$7, $$0, $$9)) {
            $$9 = cfl.a($$9, $$0.dS().an(), $$1x -> cfi.c($$0, $$1x));
            return cfi.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

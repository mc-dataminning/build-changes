import javax.annotation.Nullable;

public class cgq {
   @Nullable
   public static fbr a(bwf $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cgt.a($$0, $$1);
      return cgw.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static jh a(bwf $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      jh $$8 = cgw.a($$0.dZ(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         jh $$9 = cgw.a($$0, $$1, $$0.dZ(), $$8);
         if (!cgt.a($$9, $$0) && !cgt.a($$7, $$0, $$9)) {
            $$9 = cgw.a($$9, $$0.dW().an(), $$1x -> cgt.c($$0, $$1x));
            return cgt.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

import javax.annotation.Nullable;

public class cfz {
   @Nullable
   public static faz a(bvo $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cgc.a($$0, $$1);
      return cgf.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static ji a(bvo $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      ji $$8 = cgf.a($$0.dY(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         ji $$9 = cgf.a($$0, $$1, $$0.dY(), $$8);
         if (!cgc.a($$9, $$0) && !cgc.a($$7, $$0, $$9)) {
            $$9 = cgf.a($$9, $$0.dV().an(), $$1x -> cgc.c($$0, $$1x));
            return cgc.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

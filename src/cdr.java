import javax.annotation.Nullable;

public class cdr {
   @Nullable
   public static evz a(bth $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cdu.a($$0, $$1);
      return cdx.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static ja a(bth $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      ja $$8 = cdx.a($$0.dS(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         ja $$9 = cdx.a($$0, $$1, $$0.dS(), $$8);
         if (!cdu.a($$9, $$0) && !cdu.a($$7, $$0, $$9)) {
            $$9 = cdx.a($$9, $$0.dP().am(), $$1x -> cdu.c($$0, $$1x));
            return cdu.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

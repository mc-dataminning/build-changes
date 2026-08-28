import javax.annotation.Nullable;

public class ceh {
   @Nullable
   public static evq a(btx $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cek.a($$0, $$1);
      return cen.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static iz a(btx $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      iz $$8 = cen.a($$0.el(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         iz $$9 = cen.a($$0, $$1, $$0.el(), $$8);
         if (!cek.a($$9, $$0) && !cek.a($$7, $$0, $$9)) {
            $$9 = cen.a($$9, $$0.dP().am(), $$1x -> cek.c($$0, $$1x));
            return cek.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

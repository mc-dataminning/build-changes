import javax.annotation.Nullable;

public class cek {
   @Nullable
   public static evt a(bua $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cen.a($$0, $$1);
      return ceq.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static iz a(bua $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      iz $$8 = ceq.a($$0.el(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         iz $$9 = ceq.a($$0, $$1, $$0.el(), $$8);
         if (!cen.a($$9, $$0) && !cen.a($$7, $$0, $$9)) {
            $$9 = ceq.a($$9, $$0.dP().am(), $$1x -> cen.c($$0, $$1x));
            return cen.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

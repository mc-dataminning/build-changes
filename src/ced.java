import javax.annotation.Nullable;

public class ced {
   @Nullable
   public static evm a(btt $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = ceg.a($$0, $$1);
      return cej.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static iz a(btt $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      iz $$8 = cej.a($$0.el(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         iz $$9 = cej.a($$0, $$1, $$0.el(), $$8);
         if (!ceg.a($$9, $$0) && !ceg.a($$7, $$0, $$9)) {
            $$9 = cej.a($$9, $$0.dP().am(), $$1x -> ceg.c($$0, $$1x));
            return ceg.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

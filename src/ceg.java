import javax.annotation.Nullable;

public class ceg {
   @Nullable
   public static evp a(btw $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cej.a($$0, $$1);
      return cem.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static iz a(btw $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      iz $$8 = cem.a($$0.el(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         iz $$9 = cem.a($$0, $$1, $$0.el(), $$8);
         if (!cej.a($$9, $$0) && !cej.a($$7, $$0, $$9)) {
            $$9 = cem.a($$9, $$0.dP().am(), $$1x -> cej.c($$0, $$1x));
            return cej.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

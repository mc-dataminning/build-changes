import javax.annotation.Nullable;

public class cej {
   @Nullable
   public static evs a(btz $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cem.a($$0, $$1);
      return cep.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static iz a(btz $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      iz $$8 = cep.a($$0.el(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         iz $$9 = cep.a($$0, $$1, $$0.el(), $$8);
         if (!cem.a($$9, $$0) && !cem.a($$7, $$0, $$9)) {
            $$9 = cep.a($$9, $$0.dP().am(), $$1x -> cem.c($$0, $$1x));
            return cem.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

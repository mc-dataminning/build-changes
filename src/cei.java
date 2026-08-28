import javax.annotation.Nullable;

public class cei {
   @Nullable
   public static evr a(bty $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cel.a($$0, $$1);
      return ceo.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static iz a(bty $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      iz $$8 = ceo.a($$0.el(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         iz $$9 = ceo.a($$0, $$1, $$0.el(), $$8);
         if (!cel.a($$9, $$0) && !cel.a($$7, $$0, $$9)) {
            $$9 = ceo.a($$9, $$0.dP().am(), $$1x -> cel.c($$0, $$1x));
            return cel.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

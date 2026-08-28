import javax.annotation.Nullable;

public class chz {
   @Nullable
   public static feq a(bxm $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = chy.a($$0, $$1);
      return cib.a($$0, () -> {
         iu $$9 = cib.a($$0.dY(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            iu $$10 = cia.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cib.a($$10, $$0.dY().a($$6 - $$7 + 1) + $$7, $$0.dV().ao(), $$1xx -> chy.c($$0, $$1xx));
               return !chy.a($$0, $$10) && !chy.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

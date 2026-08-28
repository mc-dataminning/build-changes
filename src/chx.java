import javax.annotation.Nullable;

public class chx {
   @Nullable
   public static fei a(bxk $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = chw.a($$0, $$1);
      return chz.a($$0, () -> {
         iu $$9 = chz.a($$0.dY(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            iu $$10 = chy.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = chz.a($$10, $$0.dY().a($$6 - $$7 + 1) + $$7, $$0.dV().ao(), $$1xx -> chw.c($$0, $$1xx));
               return !chw.a($$0, $$10) && !chw.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

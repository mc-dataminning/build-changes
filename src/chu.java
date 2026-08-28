import javax.annotation.Nullable;

public class chu {
   @Nullable
   public static fdw a(bxh $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cht.a($$0, $$1);
      return chw.a($$0, () -> {
         iu $$9 = chw.a($$0.dY(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            iu $$10 = chv.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = chw.a($$10, $$0.dY().a($$6 - $$7 + 1) + $$7, $$0.dV().ao(), $$1xx -> cht.c($$0, $$1xx));
               return !cht.a($$0, $$10) && !cht.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

import javax.annotation.Nullable;

public class chm {
   @Nullable
   public static fcu a(bwz $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = chl.a($$0, $$1);
      return cho.a($$0, () -> {
         jj $$9 = cho.a($$0.dY(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            jj $$10 = chn.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cho.a($$10, $$0.dY().a($$6 - $$7 + 1) + $$7, $$0.dV().ao(), $$1xx -> chl.c($$0, $$1xx));
               return !chl.a($$0, $$10) && !chl.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

import javax.annotation.Nullable;

public class cja {
   @Nullable
   public static fgc a(byn $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = ciz.a($$0, $$1);
      return cjc.a($$0, () -> {
         iw $$9 = cjc.a($$0.dY(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            iw $$10 = cjb.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cjc.a($$10, $$0.dY().a($$6 - $$7 + 1) + $$7, $$0.dV().ao(), $$1xx -> ciz.c($$0, $$1xx));
               return !ciz.a($$0, $$10) && !ciz.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

import javax.annotation.Nullable;

public class cgv {
   @Nullable
   public static fbx a(bwg $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cgu.a($$0, $$1);
      return cgx.a($$0, () -> {
         ji $$9 = cgx.a($$0.dX(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            ji $$10 = cgw.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cgx.a($$10, $$0.dX().a($$6 - $$7 + 1) + $$7, $$0.dU().ao(), $$1xx -> cgu.c($$0, $$1xx));
               return !cgu.a($$0, $$10) && !cgu.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

import javax.annotation.Nullable;

public class cgb {
   @Nullable
   public static ezr a(bvm $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cga.a($$0, $$1);
      return cgd.a($$0, () -> {
         jh $$9 = cgd.a($$0.eb(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            jh $$10 = cgc.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cgd.a($$10, $$0.eb().a($$6 - $$7 + 1) + $$7, $$0.dY().al(), $$1xx -> cga.c($$0, $$1xx));
               return !cga.a($$0, $$10) && !cga.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

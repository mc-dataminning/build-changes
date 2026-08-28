import javax.annotation.Nullable;

public class cfx {
   @Nullable
   public static ezn a(bvi $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cfw.a($$0, $$1);
      return cfz.a($$0, () -> {
         jh $$9 = cfz.a($$0.ea(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            jh $$10 = cfy.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cfz.a($$10, $$0.ea().a($$6 - $$7 + 1) + $$7, $$0.dX().al(), $$1xx -> cfw.c($$0, $$1xx));
               return !cfw.a($$0, $$10) && !cfw.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

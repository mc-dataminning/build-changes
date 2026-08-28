import javax.annotation.Nullable;

public class chc {
   @Nullable
   public static fbx a(bwn $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = chb.a($$0, $$1);
      return che.a($$0, () -> {
         jh $$9 = che.a($$0.dY(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            jh $$10 = chd.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = che.a($$10, $$0.dY().a($$6 - $$7 + 1) + $$7, $$0.dV().am(), $$1xx -> chb.c($$0, $$1xx));
               return !chb.a($$0, $$10) && !chb.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}

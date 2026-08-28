import javax.annotation.Nullable;

public class cgy {
   @Nullable
   public static fbx a(bwn $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = chb.a($$0, $$1);
      return che.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static jh a(bwn $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      jh $$8 = che.a($$0.dZ(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         jh $$9 = che.a($$0, $$1, $$0.dZ(), $$8);
         if (!chb.a($$9, $$0) && !chb.a($$7, $$0, $$9)) {
            $$9 = che.a($$9, $$0.dW().am(), $$1x -> chb.c($$0, $$1x));
            return chb.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}

import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbu extends ccu {
   public cbu(blt<? extends cbu> $$0, cti $$1) {
      super($$0, $$1);
   }

   public static bnk.a u() {
      return ccu.w().a(bnl.l, 12.0);
   }

   @Override
   public boolean C(blp $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bmf) {
            int $$1 = 0;
            if (this.dM().ak() == bjs.c) {
               $$1 = 7;
            } else if (this.dM().ak() == bjs.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bmf)$$0).b(new blc(ble.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      return $$3;
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return 0.45F;
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   @Override
   protected float l(blp $$0) {
      return $$0.dg() <= this.dg() ? -0.21875F : 0.0F;
   }
}

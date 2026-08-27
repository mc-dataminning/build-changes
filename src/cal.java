import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cal extends cbl {
   public cal(bkm<? extends cal> $$0, crs $$1) {
      super($$0, $$1);
   }

   public static bmd.a s() {
      return cbl.t().a(bme.l, 12.0);
   }

   @Override
   public boolean C(bki $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bky) {
            int $$1 = 0;
            if (this.dL().ai() == bin.c) {
               $$1 = 7;
            } else if (this.dL().ai() == bin.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bky)$$0).b(new bjv(bjx.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      return $$3;
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return 0.45F;
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   @Override
   protected float l(bki $$0) {
      return $$0.df() <= this.df() ? -0.21875F : 0.0F;
   }
}

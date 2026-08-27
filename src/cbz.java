import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbz extends ccz {
   public cbz(bly<? extends cbz> $$0, cto $$1) {
      super($$0, $$1);
   }

   public static bnp.a u() {
      return ccz.w().a(bnq.l, 12.0);
   }

   @Override
   public boolean C(blu $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bmk) {
            int $$1 = 0;
            if (this.dM().ak() == bjx.c) {
               $$1 = 7;
            } else if (this.dM().ak() == bjx.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bmk)$$0).b(new blh(blj.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      return $$3;
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return 0.45F;
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   @Override
   protected float l(blu $$0) {
      return $$0.dg() <= this.dg() ? -0.21875F : 0.0F;
   }
}

import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cat extends cbt {
   public cat(bku<? extends cat> $$0, csa $$1) {
      super($$0, $$1);
   }

   public static bml.a u() {
      return cbt.w().a(bmm.l, 12.0);
   }

   @Override
   public boolean C(bkq $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof blg) {
            int $$1 = 0;
            if (this.dN().aj() == biu.c) {
               $$1 = 7;
            } else if (this.dN().aj() == biu.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((blg)$$0).b(new bkd(bkf.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      return $$3;
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return 0.45F;
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   @Override
   protected float l(bkq $$0) {
      return $$0.dh() <= this.dh() ? -0.21875F : 0.0F;
   }
}

import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cay extends cby {
   public cay(bkz<? extends cay> $$0, csf $$1) {
      super($$0, $$1);
   }

   public static bmq.a u() {
      return cby.w().a(bmr.l, 12.0);
   }

   @Override
   public boolean C(bkv $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bll) {
            int $$1 = 0;
            if (this.dN().aj() == biy.c) {
               $$1 = 7;
            } else if (this.dN().aj() == biy.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bll)$$0).b(new bki(bkk.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      return $$3;
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return 0.45F;
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   @Override
   protected float l(bkv $$0) {
      return $$0.dh() <= this.dh() ? -0.21875F : 0.0F;
   }
}

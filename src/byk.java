import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byk extends bzk {
   public byk(bik<? extends byk> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public static bkc.a p() {
      return bzk.q().a(bkd.a, 12.0);
   }

   @Override
   public boolean C(big $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof biw) {
            int $$1 = 0;
            if (this.dK().ai() == bgl.c) {
               $$1 = 7;
            } else if (this.dK().ai() == bgl.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((biw)$$0).b(new bht(bhv.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      return $$3;
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return 0.45F;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   @Override
   protected float l(big $$0) {
      return $$0.df() <= this.df() ? -0.21875F : 0.0F;
   }
}

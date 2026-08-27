import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byt extends bzt {
   public byt(biu<? extends byt> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public static bkl.a s() {
      return bzt.t().a(bkm.a, 12.0);
   }

   @Override
   public boolean C(biq $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bjg) {
            int $$1 = 0;
            if (this.dL().ai() == bgv.c) {
               $$1 = 7;
            } else if (this.dL().ai() == bgv.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bjg)$$0).b(new bid(bif.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qy $$4) {
      return $$3;
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return 0.45F;
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   @Override
   protected float l(biq $$0) {
      return $$0.df() <= this.df() ? -0.21875F : 0.0F;
   }
}

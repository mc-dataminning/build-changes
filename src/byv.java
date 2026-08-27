import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byv extends bzv {
   public byv(biw<? extends byv> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public static bkn.a s() {
      return bzv.t().a(bko.a, 12.0);
   }

   @Override
   public boolean C(bis $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bji) {
            int $$1 = 0;
            if (this.dL().ai() == bgx.c) {
               $$1 = 7;
            } else if (this.dL().ai() == bgx.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bji)$$0).b(new bif(bih.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      return $$3;
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return 0.45F;
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   @Override
   protected float l(bis $$0) {
      return $$0.df() <= this.df() ? -0.21875F : 0.0F;
   }
}

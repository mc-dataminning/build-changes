import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byz extends bzz {
   public byz(bja<? extends byz> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public static bkr.a s() {
      return bzz.t().a(bks.l, 12.0);
   }

   @Override
   public boolean C(biw $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bjm) {
            int $$1 = 0;
            if (this.dL().ai() == bhb.c) {
               $$1 = 7;
            } else if (this.dL().ai() == bhb.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bjm)$$0).b(new bij(bil.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      return $$3;
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return 0.45F;
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   @Override
   protected float l(biw $$0) {
      return $$0.df() <= this.df() ? -0.21875F : 0.0F;
   }
}

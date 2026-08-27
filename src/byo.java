import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byo extends bzo {
   public byo(bip<? extends byo> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public static bkg.a p() {
      return bzo.q().a(bkh.a, 12.0);
   }

   @Override
   public boolean C(bil $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bjb) {
            int $$1 = 0;
            if (this.dK().ai() == bgq.c) {
               $$1 = 7;
            } else if (this.dK().ai() == bgq.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bjb)$$0).b(new bhy(bia.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      return $$3;
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return 0.45F;
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   @Override
   protected float l(bil $$0) {
      return $$0.df() <= this.df() ? -0.21875F : 0.0F;
   }
}

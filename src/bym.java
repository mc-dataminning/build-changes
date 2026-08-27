import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bym extends bzm {
   public bym(bim<? extends bym> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public static bke.a p() {
      return bzm.q().a(bkf.a, 12.0);
   }

   @Override
   public boolean C(bii $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof biy) {
            int $$1 = 0;
            if (this.dK().ai() == bgn.c) {
               $$1 = 7;
            } else if (this.dK().ai() == bgn.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((biy)$$0).b(new bhv(bhx.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      return $$3;
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return 0.45F;
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   @Override
   protected float l(bii $$0) {
      return $$0.df() <= this.df() ? -0.21875F : 0.0F;
   }
}

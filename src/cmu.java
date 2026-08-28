import javax.annotation.Nullable;

public class cmu extends cnu {
   public cmu(bwb<? extends cmu> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public static bxw.a j() {
      return cnu.m().a(bxx.s, 12.0);
   }

   @Override
   public boolean c(arn $$0, bvs $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bwr) {
            int $$2 = 0;
            if (this.dV().an() == btn.c) {
               $$2 = 7;
            } else if (this.dV().an() == btn.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((bwr)$$1).b(new buw(buy.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      return $$3;
   }

   @Override
   public fcu l(bvs $$0) {
      return $$0.dq() <= this.dq() ? new fcu(0.0, 0.21875 * (double)this.ek(), 0.0) : super.l($$0);
   }
}

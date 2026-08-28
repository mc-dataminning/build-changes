import javax.annotation.Nullable;

public class ckc extends cjw {
   private final ckd bF = new ckd(this);
   private static final int bG = 18000;
   private static final bvd bH = bvi.bf.n().a(bvc.a().a(bvb.a, 0.0F, bvi.bf.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean bJ;
   private int bK;

   public ckc(bvi<? extends ckc> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public static bxf.a q() {
      return gU().a(bxg.s, 15.0).a(bxg.v, 0.2F);
   }

   public static boolean c(bvi<? extends chp> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return !bvh.a($$2) ? chp.b($$0, $$1, $$2, $$3, $$4) : bvh.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azh $$0) {
      this.g(bxg.o).a(a($$0::j));
   }

   @Override
   protected void gK() {
   }

   @Override
   protected avz u() {
      return this.a(awv.a) ? awa.xS : awa.xO;
   }

   @Override
   protected avz l_() {
      return awa.xP;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.xQ;
   }

   @Override
   protected avz aV() {
      if (this.aJ()) {
         if (!this.bZ()) {
            return awa.xV;
         }

         this.cf++;
         if (this.cf > 5 && this.cf % 3 == 0) {
            return awa.xT;
         }

         if (this.cf <= 5) {
            return awa.xV;
         }
      }

      return awa.xR;
   }

   @Override
   protected void g(float $$0) {
      if (this.aJ()) {
         super.g(0.3F);
      } else {
         super.g(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void ha() {
      if (this.bj()) {
         this.a(awa.xU, 0.4F, 1.0F);
      } else {
         super.ha();
      }
   }

   @Override
   public bvd e(bwk $$0) {
      return this.n_() ? bH : super.e($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.t() && this.bK++ >= 18000) {
         this.at();
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.bK);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.bK = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fm() {
      return 0.96F;
   }

   public boolean t() {
      return this.bJ;
   }

   public void w(boolean $$0) {
      if ($$0 != this.bJ) {
         this.bJ = $$0;
         if ($$0) {
            this.bC.a(1, this.bF);
         } else {
            this.bC.a(this.bF);
         }
      }
   }

   @Nullable
   @Override
   public buq a(ard $$0, buq $$1) {
      return bvi.bf.a($$0, bvh.e);
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      return (bsy)(!this.gJ() ? bsy.e : super.b($$0, $$1));
   }
}

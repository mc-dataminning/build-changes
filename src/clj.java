import javax.annotation.Nullable;

public class clj extends cld {
   private final clk bF = new clk(this);
   private static final int bG = 18000;
   private static final bwg bH = bwm.bg.n().a(bwf.a().a(bwe.a, 0.0F, bwm.bg.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean bJ;
   private int bK;

   public clj(bwm<? extends clj> $$0, div $$1) {
      super($$0, $$1);
   }

   public static byh.a q() {
      return gR().a(byi.s, 15.0).a(byi.v, 0.2F);
   }

   public static boolean c(bwm<? extends cis> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return !bwl.a($$2) ? cis.b($$0, $$1, $$2, $$3, $$4) : bwl.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azv $$0) {
      this.g(byi.o).a(a($$0::j));
   }

   @Override
   protected void gI() {
   }

   @Override
   protected awm u() {
      return this.a(axh.a) ? awn.xV : awn.xR;
   }

   @Override
   protected awm l_() {
      return awn.xS;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.xT;
   }

   @Override
   protected awm aV() {
      if (this.aJ()) {
         if (!this.ca()) {
            return awn.xY;
         }

         this.cc++;
         if (this.cc > 5 && this.cc % 3 == 0) {
            return awn.xW;
         }

         if (this.cc <= 5) {
            return awn.xY;
         }
      }

      return awn.xU;
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
   protected void gX() {
      if (this.bj()) {
         this.a(awn.xX, 0.4F, 1.0F);
      } else {
         super.gX();
      }
   }

   @Override
   public bwg e(bxo $$0) {
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
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.bK);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.bK = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fj() {
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
   public bvt a(arq $$0, bvt $$1) {
      return bwm.bg.a($$0, bwl.e);
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      return (bub)(!this.gH() ? bub.e : super.b($$0, $$1));
   }
}

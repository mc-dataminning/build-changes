import javax.annotation.Nullable;

public class cld extends ckx {
   private final cle bF = new cle(this);
   private static final int bG = 18000;
   private static final bwd bH = bwj.bg.n().a(bwc.a().a(bwb.a, 0.0F, bwj.bg.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean bJ;
   private int bK;

   public cld(bwj<? extends cld> $$0, dip $$1) {
      super($$0, $$1);
   }

   public static bye.a q() {
      return gR().a(byf.s, 15.0).a(byf.v, 0.2F);
   }

   public static boolean c(bwj<? extends cio> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return !bwi.a($$2) ? cio.b($$0, $$1, $$2, $$3, $$4) : bwi.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azt $$0) {
      this.g(byf.o).a(a($$0::j));
   }

   @Override
   protected void gI() {
   }

   @Override
   protected awk u() {
      return this.a(axf.a) ? awl.xS : awl.xO;
   }

   @Override
   protected awk l_() {
      return awl.xP;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.xQ;
   }

   @Override
   protected awk aV() {
      if (this.aJ()) {
         if (!this.ca()) {
            return awl.xV;
         }

         this.cc++;
         if (this.cc > 5 && this.cc % 3 == 0) {
            return awl.xT;
         }

         if (this.cc <= 5) {
            return awl.xV;
         }
      }

      return awl.xR;
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
         this.a(awl.xU, 0.4F, 1.0F);
      } else {
         super.gX();
      }
   }

   @Override
   public bwd e(bxl $$0) {
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
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.bK);
   }

   @Override
   public void a(tx $$0) {
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
   public bvq a(aro $$0, bvq $$1) {
      return bwj.bg.a($$0, bwi.e);
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      return (bty)(!this.gH() ? bty.e : super.b($$0, $$1));
   }
}

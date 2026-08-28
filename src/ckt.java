import javax.annotation.Nullable;

public class ckt extends ckn {
   private final cku bE = new cku(this);
   private static final int bF = 18000;
   private static final bvv bG = bwb.bf.n().a(bvu.a().a(bvt.a, 0.0F, bwb.bf.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean bI;
   private int bJ;

   public ckt(bwb<? extends ckt> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public static bxw.a q() {
      return gR().a(bxx.s, 15.0).a(bxx.v, 0.2F);
   }

   public static boolean c(bwb<? extends cig> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return !bwa.a($$2) ? cig.b($$0, $$1, $$2, $$3, $$4) : bwa.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azs $$0) {
      this.g(bxx.o).a(a($$0::j));
   }

   @Override
   protected void gI() {
   }

   @Override
   protected awj u() {
      return this.a(axf.a) ? awk.xS : awk.xO;
   }

   @Override
   protected awj l_() {
      return awk.xP;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.xQ;
   }

   @Override
   protected awj aV() {
      if (this.aJ()) {
         if (!this.ca()) {
            return awk.xV;
         }

         this.cb++;
         if (this.cb > 5 && this.cb % 3 == 0) {
            return awk.xT;
         }

         if (this.cb <= 5) {
            return awk.xV;
         }
      }

      return awk.xR;
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
         this.a(awk.xU, 0.4F, 1.0F);
      } else {
         super.gX();
      }
   }

   @Override
   public bvv e(bxd $$0) {
      return this.n_() ? bG : super.e($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.t() && this.bJ++ >= 18000) {
         this.at();
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.bJ);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.bJ = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fj() {
      return 0.96F;
   }

   public boolean t() {
      return this.bI;
   }

   public void w(boolean $$0) {
      if ($$0 != this.bI) {
         this.bI = $$0;
         if ($$0) {
            this.bB.a(1, this.bE);
         } else {
            this.bB.a(this.bE);
         }
      }
   }

   @Nullable
   @Override
   public bvi a(arn $$0, bvi $$1) {
      return bwb.bf.a($$0, bwa.e);
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      return (btq)(!this.gH() ? btq.e : super.b($$0, $$1));
   }
}

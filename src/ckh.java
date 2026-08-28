import javax.annotation.Nullable;

public class ckh extends ckb {
   private final cki bZ = new cki(this);
   private static final int ca = 18000;
   private static final bvn cb = bvr.bg.n().a(bvm.a().a(bvl.a, 0.0F, bvr.bg.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cd;
   private int ce;

   public ckh(bvr<? extends ckh> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public static bxn.a p() {
      return gQ().a(bxo.s, 15.0).a(bxo.v, 0.2F);
   }

   public static boolean c(bvr<? extends chx> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      return !bvq.a($$2) ? chx.b($$0, $$1, $$2, $$3, $$4) : bvq.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(bam $$0) {
      this.g(bxo.o).a(a($$0::j));
   }

   @Override
   protected void gG() {
   }

   @Override
   protected axe u() {
      return this.a(aya.a) ? axf.xC : axf.xy;
   }

   @Override
   protected axe o_() {
      return axf.xz;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.xA;
   }

   @Override
   protected axe aV() {
      if (this.aJ()) {
         if (!this.ca()) {
            return axf.xF;
         }

         this.cz++;
         if (this.cz > 5 && this.cz % 3 == 0) {
            return axf.xD;
         }

         if (this.cz <= 5) {
            return axf.xF;
         }
      }

      return axf.xB;
   }

   @Override
   protected void f(float $$0) {
      if (this.aJ()) {
         super.f(0.3F);
      } else {
         super.f(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void gW() {
      if (this.bj()) {
         this.a(axf.xE, 0.4F, 1.0F);
      } else {
         super.gW();
      }
   }

   @Override
   public bvn e(bws $$0) {
      return this.e_() ? cb : super.e($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.t() && this.ce++ >= 18000) {
         this.at();
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.ce);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.x($$0.q("SkeletonTrap"));
      this.ce = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fm() {
      return 0.96F;
   }

   public boolean t() {
      return this.cd;
   }

   public void x(boolean $$0) {
      if ($$0 != this.cd) {
         this.cd = $$0;
         if ($$0) {
            this.bT.a(1, this.bZ);
         } else {
            this.bT.a(this.bZ);
         }
      }
   }

   @Nullable
   @Override
   public bvb a(ash $$0, bvb $$1) {
      return bvr.bg.a($$0, bvq.e);
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      return (btj)(!this.gF() ? btj.e : super.b($$0, $$1));
   }
}

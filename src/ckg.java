import javax.annotation.Nullable;

public class ckg extends cka {
   private final ckh bZ = new ckh(this);
   private static final int ca = 18000;
   private static final bvm cb = bvq.bg.n().a(bvl.a().a(bvk.a, 0.0F, bvq.bg.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cd;
   private int ce;

   public ckg(bvq<? extends ckg> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public static bxm.a p() {
      return gO().a(bxn.s, 15.0).a(bxn.v, 0.2F);
   }

   public static boolean c(bvq<? extends chw> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return !bvp.a($$2) ? chw.b($$0, $$1, $$2, $$3, $$4) : bvp.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(bam $$0) {
      this.g(bxn.o).a(a($$0::j));
   }

   @Override
   protected void gE() {
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
   protected axe e(btz $$0) {
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
   protected void gU() {
      if (this.bj()) {
         this.a(axf.xE, 0.4F, 1.0F);
      } else {
         super.gU();
      }
   }

   @Override
   public bvm e(bwr $$0) {
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
   protected float fk() {
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
   public bva a(ash $$0, bva $$1) {
      return bvq.bg.a($$0, bvp.e);
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      return (bti)(!this.gD() ? bti.e : super.b($$0, $$1));
   }
}

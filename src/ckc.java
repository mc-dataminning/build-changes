import javax.annotation.Nullable;

public class ckc extends cjw {
   private final ckd bZ = new ckd(this);
   private static final int ca = 18000;
   private static final bvi cb = bvm.bg.n().a(bvh.a().a(bvg.a, 0.0F, bvm.bg.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cd;
   private int ce;

   public ckc(bvm<? extends ckc> $$0, dha $$1) {
      super($$0, $$1);
   }

   public static bxi.a p() {
      return gO().a(bxj.s, 15.0).a(bxj.v, 0.2F);
   }

   public static boolean c(bvm<? extends chs> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return !bvl.a($$2) ? chs.b($$0, $$1, $$2, $$3, $$4) : bvl.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(bam $$0) {
      this.g(bxj.o).a(a($$0::j));
   }

   @Override
   protected void gE() {
   }

   @Override
   protected axe u() {
      return this.a(aya.a) ? axf.xB : axf.xx;
   }

   @Override
   protected axe o_() {
      return axf.xy;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.xz;
   }

   @Override
   protected axe aV() {
      if (this.aJ()) {
         if (!this.ca()) {
            return axf.xE;
         }

         this.cz++;
         if (this.cz > 5 && this.cz % 3 == 0) {
            return axf.xC;
         }

         if (this.cz <= 5) {
            return axf.xE;
         }
      }

      return axf.xA;
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
         this.a(axf.xD, 0.4F, 1.0F);
      } else {
         super.gU();
      }
   }

   @Override
   public bvi e(bwn $$0) {
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
   public buw a(ash $$0, buw $$1) {
      return bvm.bg.a($$0, bvl.e);
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      return (bte)(!this.gD() ? bte.e : super.b($$0, $$1));
   }
}

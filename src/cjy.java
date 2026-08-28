import javax.annotation.Nullable;

public class cjy extends cjs {
   private final cjz bZ = new cjz(this);
   private static final int ca = 18000;
   private static final bve cb = bvi.bg.n().a(bvd.a().a(bvc.a, 0.0F, bvi.bg.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cd;
   private int ce;

   public cjy(bvi<? extends cjy> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public static bxe.a p() {
      return gQ().a(bxf.s, 15.0).a(bxf.v, 0.2F);
   }

   public static boolean c(bvi<? extends cho> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return !bvh.a($$2) ? cho.b($$0, $$1, $$2, $$3, $$4) : bvh.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(bac $$0) {
      this.g(bxf.o).a(a($$0::j));
   }

   @Override
   protected void gG() {
   }

   @Override
   protected awu u() {
      return this.a(axq.a) ? awv.xI : awv.xE;
   }

   @Override
   protected awu o_() {
      return awv.xF;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.xG;
   }

   @Override
   protected awu aV() {
      if (this.aJ()) {
         if (!this.ca()) {
            return awv.xL;
         }

         this.cz++;
         if (this.cz > 5 && this.cz % 3 == 0) {
            return awv.xJ;
         }

         if (this.cz <= 5) {
            return awv.xL;
         }
      }

      return awv.xH;
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
         this.a(awv.xK, 0.4F, 1.0F);
      } else {
         super.gW();
      }
   }

   @Override
   public bve e(bwj $$0) {
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
   public void b(um $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.ce);
   }

   @Override
   public void a(um $$0) {
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
   public bus a(arx $$0, bus $$1) {
      return bvi.bg.a($$0, bvh.e);
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      return (bta)(!this.gF() ? bta.e : super.b($$0, $$1));
   }
}

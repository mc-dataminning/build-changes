import javax.annotation.Nullable;

public class cik extends cie {
   private final cil bY = new cil(this);
   private static final int bZ = 18000;
   private static final btr ca = btv.aO.n().a(btq.a().a(btp.a, 0.0F, btv.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public cik(btv<? extends cik> $$0, deg $$1) {
      super($$0, $$1);
   }

   public static bvq.a q() {
      return gR().a(bvr.s, 15.0).a(bvr.v, 0.2F);
   }

   public static boolean c(btv<? extends cga> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return !btu.a($$2) ? cga.b($$0, $$1, $$2, $$3, $$4) : btu.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azl $$0) {
      this.g(bvr.o).a(a($$0::j));
   }

   @Override
   protected void gH() {
   }

   @Override
   protected awd w() {
      return this.a(awz.a) ? awe.xj : awe.xf;
   }

   @Override
   protected awd n_() {
      return awe.xg;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.xh;
   }

   @Override
   protected awd aT() {
      if (this.aH()) {
         if (!this.bX()) {
            return awe.xm;
         }

         this.cy++;
         if (this.cy > 5 && this.cy % 3 == 0) {
            return awe.xk;
         }

         if (this.cy <= 5) {
            return awe.xm;
         }
      }

      return awe.xi;
   }

   @Override
   protected void f(float $$0) {
      if (this.aH()) {
         super.f(0.3F);
      } else {
         super.f(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void gY() {
      if (this.bi()) {
         this.a(awe.xl, 0.4F, 1.0F);
      } else {
         super.gY();
      }
   }

   @Override
   public btr e(buw $$0) {
      return this.o_() ? ca : super.e($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.t() && this.cd++ >= 18000) {
         this.as();
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.cd);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.q("SkeletonTrap"));
      this.cd = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fj() {
      return 0.96F;
   }

   public boolean t() {
      return this.cc;
   }

   public void x(boolean $$0) {
      if ($$0 != this.cc) {
         this.cc = $$0;
         if ($$0) {
            this.bS.a(1, this.bY);
         } else {
            this.bS.a(this.bY);
         }
      }
   }

   @Nullable
   @Override
   public bth a(arh $$0, bth $$1) {
      return btv.aO.a($$0, btu.e);
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      return (brp)(!this.gG() ? brp.e : super.b($$0, $$1));
   }
}

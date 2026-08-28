import javax.annotation.Nullable;

public class ciw extends ciq {
   private final cix bY = new cix(this);
   private static final int bZ = 18000;
   private static final buc ca = bug.aO.n().a(bub.a().a(bua.a, 0.0F, bug.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public ciw(bug<? extends ciw> $$0, dev $$1) {
      super($$0, $$1);
   }

   public static bwc.a q() {
      return gX().a(bwd.s, 15.0).a(bwd.v, 0.2F);
   }

   public static boolean c(bug<? extends cgm> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return !buf.a($$2) ? cgm.b($$0, $$1, $$2, $$3, $$4) : buf.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azr $$0) {
      this.g(bwd.o).a(a($$0::j));
   }

   @Override
   protected void gN() {
   }

   @Override
   protected awj w() {
      return this.a(axf.a) ? awk.xh : awk.xd;
   }

   @Override
   protected awj o_() {
      return awk.xe;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.xf;
   }

   @Override
   protected awj aV() {
      if (this.aJ()) {
         if (!this.cb()) {
            return awk.xk;
         }

         this.cy++;
         if (this.cy > 5 && this.cy % 3 == 0) {
            return awk.xi;
         }

         if (this.cy <= 5) {
            return awk.xk;
         }
      }

      return awk.xg;
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
   protected void he() {
      if (this.bk()) {
         this.a(awk.xj, 0.4F, 1.0F);
      } else {
         super.he();
      }
   }

   @Override
   public buc e(bvh $$0) {
      return this.p_() ? ca : super.e($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.t() && this.cd++ >= 18000) {
         this.au();
      }
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.cd);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.x($$0.q("SkeletonTrap"));
      this.cd = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fo() {
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
   public btq a(arm $$0, btq $$1) {
      return bug.aO.a($$0, buf.e);
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      return (bry)(!this.gM() ? bry.e : super.b($$0, $$1));
   }
}

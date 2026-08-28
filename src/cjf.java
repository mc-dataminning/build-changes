import javax.annotation.Nullable;

public class cjf extends ciz {
   private final cjg bY = new cjg(this);
   private static final int bZ = 18000;
   private static final bul ca = bup.aO.n().a(buk.a().a(buj.a, 0.0F, bup.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public cjf(bup<? extends cjf> $$0, dff $$1) {
      super($$0, $$1);
   }

   public static bwl.a q() {
      return gX().a(bwm.s, 15.0).a(bwm.v, 0.2F);
   }

   public static boolean c(bup<? extends cgv> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return !buo.a($$2) ? cgv.b($$0, $$1, $$2, $$3, $$4) : buo.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azv $$0) {
      this.g(bwm.o).a(a($$0::j));
   }

   @Override
   protected void gN() {
   }

   @Override
   protected awn w() {
      return this.a(axj.a) ? awo.xh : awo.xd;
   }

   @Override
   protected awn o_() {
      return awo.xe;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.xf;
   }

   @Override
   protected awn aX() {
      if (this.aL()) {
         if (!this.cc()) {
            return awo.xk;
         }

         this.cy++;
         if (this.cy > 5 && this.cy % 3 == 0) {
            return awo.xi;
         }

         if (this.cy <= 5) {
            return awo.xk;
         }
      }

      return awo.xg;
   }

   @Override
   protected void f(float $$0) {
      if (this.aL()) {
         super.f(0.3F);
      } else {
         super.f(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void he() {
      if (this.bl()) {
         this.a(awo.xj, 0.4F, 1.0F);
      } else {
         super.he();
      }
   }

   @Override
   public bul e(bvq $$0) {
      return this.p_() ? ca : super.e($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.t() && this.cd++ >= 18000) {
         this.av();
      }
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.cd);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.x($$0.q("SkeletonTrap"));
      this.cd = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fp() {
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
   public btz a(arq $$0, btz $$1) {
      return bup.aO.a($$0, buo.e);
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      return (bsh)(!this.gM() ? bsh.e : super.b($$0, $$1));
   }
}

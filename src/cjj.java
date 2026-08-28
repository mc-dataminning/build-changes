import javax.annotation.Nullable;

public class cjj extends cjd {
   private final cjk bY = new cjk(this);
   private static final int bZ = 18000;
   private static final bup ca = but.bf.n().a(buo.a().a(bun.a, 0.0F, but.bf.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public cjj(but<? extends cjj> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public static bwp.a p() {
      return gU().a(bwq.s, 15.0).a(bwq.v, 0.2F);
   }

   public static boolean c(but<? extends cgz> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      return !bus.a($$2) ? cgz.b($$0, $$1, $$2, $$3, $$4) : bus.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azh $$0) {
      this.g(bwq.o).a(a($$0::j));
   }

   @Override
   protected void gK() {
   }

   @Override
   protected avz u() {
      return this.a(awv.a) ? awa.xI : awa.xE;
   }

   @Override
   protected avz o_() {
      return awa.xF;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.xG;
   }

   @Override
   protected avz aV() {
      if (this.aJ()) {
         if (!this.ca()) {
            return awa.xL;
         }

         this.cy++;
         if (this.cy > 5 && this.cy % 3 == 0) {
            return awa.xJ;
         }

         if (this.cy <= 5) {
            return awa.xL;
         }
      }

      return awa.xH;
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
   protected void ha() {
      if (this.bj()) {
         this.a(awa.xK, 0.4F, 1.0F);
      } else {
         super.ha();
      }
   }

   @Override
   public bup e(bvu $$0) {
      return this.e_() ? ca : super.e($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.t() && this.cd++ >= 18000) {
         this.at();
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.cd);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("SkeletonTrap"));
      this.cd = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fm() {
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
   public bud a(ard $$0, bud $$1) {
      return but.bf.a($$0, bus.e);
   }

   @Override
   public bsl b(coy $$0, bsk $$1) {
      return (bsl)(!this.gJ() ? bsl.e : super.b($$0, $$1));
   }
}

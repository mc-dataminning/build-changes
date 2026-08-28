import javax.annotation.Nullable;

public class cjh extends cjb {
   private final cji bY = new cji(this);
   private static final int bZ = 18000;
   private static final bun ca = bur.bf.n().a(bum.a().a(bul.a, 0.0F, bur.bf.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public cjh(bur<? extends cjh> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public static bwn.a p() {
      return gU().a(bwo.s, 15.0).a(bwo.v, 0.2F);
   }

   public static boolean c(bur<? extends cgx> $$0, dgi $$1, buq $$2, ji $$3, azh $$4) {
      return !buq.a($$2) ? cgx.b($$0, $$1, $$2, $$3, $$4) : buq.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azh $$0) {
      this.g(bwo.o).a(a($$0::j));
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
   protected avz e(bta $$0) {
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
   public bun e(bvs $$0) {
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
   public bub a(ard $$0, bub $$1) {
      return bur.bf.a($$0, buq.e);
   }

   @Override
   public bsj b(cow $$0, bsi $$1) {
      return (bsj)(!this.gJ() ? bsj.e : super.b($$0, $$1));
   }
}

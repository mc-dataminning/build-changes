import javax.annotation.Nullable;

public class cjg extends cja {
   private final cjh bY = new cjh(this);
   private static final int bZ = 18000;
   private static final bum ca = buq.bf.n().a(bul.a().a(buk.a, 0.0F, buq.bf.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public cjg(buq<? extends cjg> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public static bwm.a p() {
      return gR().a(bwn.s, 15.0).a(bwn.v, 0.2F);
   }

   public static boolean c(buq<? extends cgw> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return !bup.a($$2) ? cgw.b($$0, $$1, $$2, $$3, $$4) : bup.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azg $$0) {
      this.g(bwn.o).a(a($$0::j));
   }

   @Override
   protected void gH() {
   }

   @Override
   protected avy u() {
      return this.a(awu.a) ? avz.xI : avz.xE;
   }

   @Override
   protected avy o_() {
      return avz.xF;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.xG;
   }

   @Override
   protected avy aV() {
      if (this.aJ()) {
         if (!this.ca()) {
            return avz.xL;
         }

         this.cy++;
         if (this.cy > 5 && this.cy % 3 == 0) {
            return avz.xJ;
         }

         if (this.cy <= 5) {
            return avz.xL;
         }
      }

      return avz.xH;
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
   protected void gX() {
      if (this.bj()) {
         this.a(avz.xK, 0.4F, 1.0F);
      } else {
         super.gX();
      }
   }

   @Override
   public bum e(bvr $$0) {
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
   public bua a(arc $$0, bua $$1) {
      return buq.bf.a($$0, bup.e);
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      return (bsi)(!this.gG() ? bsi.e : super.b($$0, $$1));
   }
}

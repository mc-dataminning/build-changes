import javax.annotation.Nullable;

public class cjb extends civ {
   private final cjc bY = new cjc(this);
   private static final int bZ = 18000;
   private static final buh ca = bul.aO.n().a(bug.a().a(buf.a, 0.0F, bul.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public cjb(bul<? extends cjb> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public static bwh.a q() {
      return gW().a(bwi.s, 15.0).a(bwi.v, 0.2F);
   }

   public static boolean c(bul<? extends cgr> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return !buk.a($$2) ? cgr.b($$0, $$1, $$2, $$3, $$4) : buk.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azs $$0) {
      this.g(bwi.o).a(a($$0::j));
   }

   @Override
   protected void gM() {
   }

   @Override
   protected awk w() {
      return this.a(axg.a) ? awl.xh : awl.xd;
   }

   @Override
   protected awk o_() {
      return awl.xe;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.xf;
   }

   @Override
   protected awk aW() {
      if (this.aK()) {
         if (!this.cb()) {
            return awl.xk;
         }

         this.cy++;
         if (this.cy > 5 && this.cy % 3 == 0) {
            return awl.xi;
         }

         if (this.cy <= 5) {
            return awl.xk;
         }
      }

      return awl.xg;
   }

   @Override
   protected void f(float $$0) {
      if (this.aK()) {
         super.f(0.3F);
      } else {
         super.f(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void hd() {
      if (this.bk()) {
         this.a(awl.xj, 0.4F, 1.0F);
      } else {
         super.hd();
      }
   }

   @Override
   public buh e(bvm $$0) {
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
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.cd);
   }

   @Override
   public void a(uk $$0) {
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
   public btv a(arn $$0, btv $$1) {
      return bul.aO.a($$0, buk.e);
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      return (bsd)(!this.gL() ? bsd.e : super.b($$0, $$1));
   }
}

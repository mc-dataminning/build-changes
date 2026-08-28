public class clo extends clx {
   private static final int a = 2400;
   private int b;

   public clo(bur<? extends clo> $$0, dgh $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void E() {
      this.bS.a(1, new cby(this));
      this.bS.a(1, new cbt(this, this.dV()));
      this.bS.a(2, new cco(this, 1.0, false));
      this.bS.a(3, new cdr(this, 1.0));
      this.bS.a(7, new ccm(this, cow.class, 8.0F));
      this.bS.a(8, new ccz(this));
      this.bT.a(1, new cdw(this).a());
      this.bT.a(2, new cdx<>(this, cow.class, true));
   }

   public static bwn.a m() {
      return clx.gx().a(bwo.s, 8.0).a(bwo.v, 0.25).a(bwo.c, 2.0);
   }

   @Override
   protected buk.c bg() {
      return buk.c.c;
   }

   @Override
   protected avz u() {
      return awa.iK;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.iM;
   }

   @Override
   protected avz o_() {
      return awa.iL;
   }

   @Override
   protected void b(ji $$0, dww $$1) {
      this.a(awa.iN, 0.15F, 1.0F);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.b = $$0.h("Lifetime");
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.b);
   }

   @Override
   public void h() {
      this.aX = this.dL();
      super.h();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dV().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dV().a(lt.ae, this.d(0.5), this.dD(), this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fZ()) {
            this.b++;
         }

         if (this.b >= 2400) {
            this.at();
         }
      }
   }

   public static boolean b(bur<clo> $$0, dgi $$1, buq $$2, ji $$3, azh $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (buq.a($$2)) {
         return true;
      } else {
         cow $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}

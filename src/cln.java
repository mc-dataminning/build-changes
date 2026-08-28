public class cln extends clw {
   private static final int a = 2400;
   private int b;

   public cln(buq<? extends cln> $$0, dgg $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void B() {
      this.bS.a(1, new cbx(this));
      this.bS.a(1, new cbs(this, this.dW()));
      this.bS.a(2, new ccn(this, 1.0, false));
      this.bS.a(3, new cdq(this, 1.0));
      this.bS.a(7, new ccl(this, cov.class, 8.0F));
      this.bS.a(8, new ccy(this));
      this.bT.a(1, new cdv(this).a());
      this.bT.a(2, new cdw<>(this, cov.class, true));
   }

   public static bwm.a m() {
      return clw.gu().a(bwn.s, 8.0).a(bwn.v, 0.25).a(bwn.c, 2.0);
   }

   @Override
   protected buj.c bg() {
      return buj.c.c;
   }

   @Override
   protected avy u() {
      return avz.iK;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.iM;
   }

   @Override
   protected avy o_() {
      return avz.iL;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.iN, 0.15F, 1.0F);
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
      this.aX = this.dM();
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
      if (this.dW().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dW().a(lt.ae, this.d(0.5), this.dE(), this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.ak()) {
            this.b++;
         }

         if (this.b >= 2400) {
            this.at();
         }
      }
   }

   public static boolean b(buq<cln> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bup.a($$2)) {
         return true;
      } else {
         cov $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}

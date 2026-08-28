public class cli extends clr {
   private static final int b = 2400;
   private int c;

   public cli(bul<? extends cli> $$0, dfb $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbs(this));
      this.bS.a(1, new cbn(this, this.dX()));
      this.bS.a(2, new cci(this, 1.0, false));
      this.bS.a(3, new cdl(this, 1.0));
      this.bS.a(7, new ccg(this, com.class, 8.0F));
      this.bS.a(8, new cct(this));
      this.bT.a(1, new cdq(this).a());
      this.bT.a(2, new cdr<>(this, com.class, true));
   }

   public static bwh.a q() {
      return clr.gA().a(bwi.s, 8.0).a(bwi.v, 0.25).a(bwi.c, 2.0);
   }

   @Override
   protected bue.b bh() {
      return bue.b.c;
   }

   @Override
   protected awk w() {
      return awl.iq;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.is;
   }

   @Override
   protected awk o_() {
      return awl.ir;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.it, 0.15F, 1.0F);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aX = this.dN();
      super.l();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.dX().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dX().a(lr.ac, this.d(0.5), this.dF(), this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.gb()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.av();
         }
      }
   }

   public static boolean b(bul<cli> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (buk.a($$2)) {
         return true;
      } else {
         com $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}

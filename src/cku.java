public class cku extends cld {
   private static final int b = 2400;
   private int c;

   public cku(bty<? extends cku> $$0, dej $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbe(this));
      this.bS.a(1, new caz(this, this.dS()));
      this.bS.a(2, new cbu(this, 1.0, false));
      this.bS.a(3, new ccx(this, 1.0));
      this.bS.a(7, new cbs(this, cnx.class, 8.0F));
      this.bS.a(8, new ccf(this));
      this.bT.a(1, new cdc(this).a());
      this.bT.a(2, new cdd<>(this, cnx.class, true));
   }

   public static bvt.a q() {
      return cld.gu().a(bvu.s, 8.0).a(bvu.v, 0.25).a(bvu.c, 2.0);
   }

   @Override
   protected btr.b bf() {
      return btr.b.c;
   }

   @Override
   protected awf w() {
      return awg.iq;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.is;
   }

   @Override
   protected awf o_() {
      return awg.ir;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.it, 0.15F, 1.0F);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aT = this.dI();
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
      if (this.dS().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dS().a(lo.ac, this.d(0.5), this.dA(), this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fX()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.as();
         }
      }
   }

   public static boolean b(bty<cku> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (btx.a($$2)) {
         return true;
      } else {
         cnx $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}

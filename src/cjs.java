public class cjs extends ckb {
   private static final int b = 2400;
   private int c;

   public cjs(bsw<? extends cjs> $$0, dcu $$1) {
      super($$0, $$1);
      this.bP = 3;
   }

   @Override
   protected void z() {
      this.bU.a(1, new cae(this));
      this.bU.a(1, new bzz(this, this.dQ()));
      this.bU.a(2, new cau(this, 1.0, false));
      this.bU.a(3, new cbx(this, 1.0));
      this.bU.a(7, new cas(this, cmv.class, 8.0F));
      this.bU.a(8, new cbf(this));
      this.bV.a(1, new ccc(this).a());
      this.bV.a(2, new ccd<>(this, cmv.class, true));
   }

   public static but.a s() {
      return ckb.gs().a(buu.s, 8.0).a(buu.v, 0.25).a(buu.c, 2.0);
   }

   @Override
   protected bsq.b bc() {
      return bsq.b.c;
   }

   @Override
   protected avn v() {
      return avo.ip;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.ir;
   }

   @Override
   protected avn n_() {
      return avo.iq;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.is, 0.15F, 1.0F);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aY = this.dG();
      super.l();
   }

   @Override
   public void p(float $$0) {
      this.s($$0);
      super.p($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.dQ().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dQ().a(lm.ac, this.d(0.5), this.dy(), this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fR()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.aq();
         }
      }
   }

   public static boolean b(bsw<cjs> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cmv $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}

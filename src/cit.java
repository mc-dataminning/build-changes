public class cit extends cjd {
   private static final int b = 2400;
   private int c;

   public cit(bsb<? extends cit> $$0, dca $$1) {
      super($$0, $$1);
      this.bW = 3;
   }

   @Override
   protected void y() {
      this.cb.a(1, new bzf(this));
      this.cb.a(1, new bza(this, this.dU()));
      this.cb.a(2, new bzv(this, 1.0, false));
      this.cb.a(3, new cay(this, 1.0));
      this.cb.a(7, new bzt(this, cly.class, 8.0F));
      this.cb.a(8, new cag(this));
      this.cc.a(1, new cbd(this).a());
      this.cc.a(2, new cbe<>(this, cly.class, true));
   }

   public static btu.a r() {
      return cjd.gG().a(btv.q, 8.0).a(btv.r, 0.25).a(btv.c, 2.0);
   }

   @Override
   protected brv.c bf() {
      return brv.c.c;
   }

   @Override
   protected avn u() {
      return avo.iC;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.iE;
   }

   @Override
   protected avn n_() {
      return avo.iD;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.iF, 0.15F, 1.0F);
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
      this.bj = this.dK();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.dU().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dU().a(lb.aa, this.d(0.5), this.dC(), this.g(0.5), (this.al.j() - 0.5) * 2.0, -this.al.j(), (this.al.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.ge()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.ao();
         }
      }
   }

   public static boolean b(bsb<cit> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cly $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}

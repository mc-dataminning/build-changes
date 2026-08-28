public class cju extends ckd {
   private static final int b = 2400;
   private int c;

   public cju(bsx<? extends cju> $$0, dcw $$1) {
      super($$0, $$1);
      this.bP = 3;
   }

   @Override
   protected void B() {
      this.bU.a(1, new cag(this));
      this.bU.a(1, new cab(this, this.dP()));
      this.bU.a(2, new caw(this, 1.0, false));
      this.bU.a(3, new cbz(this, 1.0));
      this.bU.a(7, new cau(this, cmx.class, 8.0F));
      this.bU.a(8, new cbh(this));
      this.bV.a(1, new cce(this).a());
      this.bV.a(2, new ccf<>(this, cmx.class, true));
   }

   public static buv.a s() {
      return ckd.gr().a(buw.s, 8.0).a(buw.v, 0.25).a(buw.c, 2.0);
   }

   @Override
   protected bsr.b bc() {
      return bsr.b.c;
   }

   @Override
   protected avo v() {
      return avp.ip;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.ir;
   }

   @Override
   protected avo n_() {
      return avp.iq;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.is, 0.15F, 1.0F);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aY = this.dF();
      super.l();
   }

   @Override
   public void p(float $$0) {
      this.t($$0);
      super.p($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.dP().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dP().a(lm.ac, this.d(0.5), this.dx(), this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fU()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.aq();
         }
      }
   }

   public static boolean b(bsx<cju> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cmx $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}

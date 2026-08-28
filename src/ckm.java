public class ckm extends ckv {
   private static final int b = 2400;
   private int c;

   public ckm(btq<? extends ckm> $$0, dds $$1) {
      super($$0, $$1);
      this.bO = 3;
   }

   @Override
   protected void D() {
      this.bT.a(1, new caw(this));
      this.bT.a(1, new car(this, this.dS()));
      this.bT.a(2, new cbm(this, 1.0, false));
      this.bT.a(3, new ccp(this, 1.0));
      this.bT.a(7, new cbk(this, cnp.class, 8.0F));
      this.bT.a(8, new cbx(this));
      this.bU.a(1, new ccu(this).a());
      this.bU.a(2, new ccv<>(this, cnp.class, true));
   }

   public static bvl.a q() {
      return ckv.gu().a(bvm.s, 8.0).a(bvm.v, 0.25).a(bvm.c, 2.0);
   }

   @Override
   protected btj.b bf() {
      return btj.b.c;
   }

   @Override
   protected awc w() {
      return awd.iq;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.is;
   }

   @Override
   protected awc n_() {
      return awd.ir;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.it, 0.15F, 1.0F);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aU = this.dI();
      super.l();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.dS().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dS().a(ln.ac, this.d(0.5), this.dA(), this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
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

   public static boolean b(btq<ckm> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (btp.a($$2)) {
         return true;
      } else {
         cnp $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}

public class ckr extends cla {
   private static final int b = 2400;
   private int c;

   public ckr(btv<? extends ckr> $$0, deg $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbb(this));
      this.bS.a(1, new caw(this, this.dS()));
      this.bS.a(2, new cbr(this, 1.0, false));
      this.bS.a(3, new ccu(this, 1.0));
      this.bS.a(7, new cbp(this, cnu.class, 8.0F));
      this.bS.a(8, new ccc(this));
      this.bT.a(1, new ccz(this).a());
      this.bT.a(2, new cda<>(this, cnu.class, true));
   }

   public static bvq.a q() {
      return cla.gv().a(bvr.s, 8.0).a(bvr.v, 0.25).a(bvr.c, 2.0);
   }

   @Override
   protected bto.b bf() {
      return bto.b.c;
   }

   @Override
   protected awd w() {
      return awe.iq;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.is;
   }

   @Override
   protected awd n_() {
      return awe.ir;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.it, 0.15F, 1.0F);
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
      this.aT = this.dI();
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
         if (!this.fY()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.as();
         }
      }
   }

   public static boolean b(btv<ckr> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (btu.a($$2)) {
         return true;
      } else {
         cnu $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}

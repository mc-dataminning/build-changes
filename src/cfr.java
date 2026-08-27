public class cfr extends cga {
   private static final int b = 2400;
   private int c;

   public cfr(bpd<? extends cfr> $$0, cxb $$1) {
      super($$0, $$1);
      this.bM = 3;
   }

   @Override
   protected void z() {
      this.bR.a(1, new bwg(this));
      this.bR.a(1, new bwb(this, this.dM()));
      this.bR.a(2, new bww(this, 1.0, false));
      this.bR.a(3, new bxz(this, 1.0));
      this.bR.a(7, new bwu(this, ciu.class, 8.0F));
      this.bR.a(8, new bxh(this));
      this.bS.a(1, new bye(this).a());
      this.bS.a(2, new byf<>(this, ciu.class, true));
   }

   public static bqv.a r() {
      return cga.gt().a(bqw.q, 8.0).a(bqw.r, 0.25).a(bqw.c, 2.0);
   }

   @Override
   protected box.b aZ() {
      return box.b.c;
   }

   @Override
   protected atx v() {
      return aty.ii;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.ik;
   }

   @Override
   protected atx n_() {
      return aty.ij;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.il, 0.15F, 1.0F);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aX = this.dC();
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
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(kc.aa, this.d(0.5), this.du(), this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fU()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.am();
         }
      }
   }

   public static boolean b(bpd<cfr> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         ciu $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}

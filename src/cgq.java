public class cgq extends cgz {
   private static final int b = 2400;
   private int c;

   public cgq(bqb<? extends cgq> $$0, cyx $$1) {
      super($$0, $$1);
      this.bM = 3;
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxf(this));
      this.bR.a(1, new bxa(this, this.dM()));
      this.bR.a(2, new bxv(this, 1.0, false));
      this.bR.a(3, new byy(this, 1.0));
      this.bR.a(7, new bxt(this, cjt.class, 8.0F));
      this.bR.a(8, new byg(this));
      this.bS.a(1, new bzd(this).a());
      this.bS.a(2, new bze<>(this, cjt.class, true));
   }

   public static bru.a r() {
      return cgz.gt().a(brv.q, 8.0).a(brv.r, 0.25).a(brv.c, 2.0);
   }

   @Override
   protected bpv.b aZ() {
      return bpv.b.c;
   }

   @Override
   protected aul v() {
      return aum.ik;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.im;
   }

   @Override
   protected aul o_() {
      return aum.il;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.in, 0.15F, 1.0F);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(tm $$0) {
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
   public void n_() {
      super.n_();
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(kl.aa, this.d(0.5), this.du(), this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
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

   public static boolean b(bqb<cgq> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cjt $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}

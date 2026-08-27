public class cfp extends cfy {
   private static final int b = 2400;
   private int c;

   public cfp(bpc<? extends cfp> $$0, cwz $$1) {
      super($$0, $$1);
      this.bM = 3;
   }

   @Override
   protected void z() {
      this.bR.a(1, new bwf(this));
      this.bR.a(1, new bwa(this, this.dM()));
      this.bR.a(2, new bwv(this, 1.0, false));
      this.bR.a(3, new bxy(this, 1.0));
      this.bR.a(7, new bwt(this, cis.class, 8.0F));
      this.bR.a(8, new bxg(this));
      this.bS.a(1, new byd(this).a());
      this.bS.a(2, new bye<>(this, cis.class, true));
   }

   public static bqu.a r() {
      return cfy.gt().a(bqv.q, 8.0).a(bqv.r, 0.25).a(bqv.c, 2.0);
   }

   @Override
   protected bow.b aZ() {
      return bow.b.c;
   }

   @Override
   protected atx v() {
      return aty.ie;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.ig;
   }

   @Override
   protected atx n_() {
      return aty.if;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(aty.ih, 0.15F, 1.0F);
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

   public static boolean b(bpc<cfp> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cis $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}

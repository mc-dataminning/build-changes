public class dco extends ddy {
   private hp<cjf> c = hp.a(27, cjf.b);
   private final ddi f = new ddi() {
      @Override
      protected void a(cpv $$0, gw $$1, dfj $$2) {
         dco.this.a($$2, ape.bk);
         dco.this.a($$2, true);
      }

      @Override
      protected void b(cpv $$0, gw $$1, dfj $$2) {
         dco.this.a($$2, ape.bj);
         dco.this.a($$2, false);
      }

      @Override
      protected void a(cpv $$0, gw $$1, dfj $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cbu $$0) {
         if ($$0.bS instanceof ces) {
            bgr $$1 = ((ces)$$0.bS).l();
            return $$1 == dco.this;
         } else {
            return false;
         }
      }
   };

   public dco(gw $$0, dfj $$1) {
      super(dcx.A, $$0, $$1);
   }

   @Override
   protected void b(qx $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgs.a($$0, this.c);
      }
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.c = hp.a(this.b(), cjf.b);
      if (!this.d($$0)) {
         bgs.b($$0, this.c);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected hp<cjf> f() {
      return this.c;
   }

   @Override
   protected void a(hp<cjf> $$0) {
      this.c = $$0;
   }

   @Override
   protected tl g() {
      return tl.c("container.barrel");
   }

   @Override
   protected cel a(int $$0, cbt $$1) {
      return ces.a($$0, $$1, this);
   }

   @Override
   public void d_(cbu $$0) {
      if (!this.q && !$$0.M_()) {
         this.f.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cbu $$0) {
      if (!this.q && !$$0.M_()) {
         this.f.b($$0, this.k(), this.p(), this.q());
      }
   }

   public void i() {
      if (!this.q) {
         this.f.c(this.k(), this.p(), this.q());
      }
   }

   void a(dfj $$0, boolean $$1) {
      this.o.a(this.p(), $$0.a(csc.b, Boolean.valueOf($$1)), 3);
   }

   void a(dfj $$0, apd $$1) {
      ib $$2 = $$0.c(csc.a).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, apf.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}

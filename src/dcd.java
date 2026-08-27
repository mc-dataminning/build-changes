public class dcd extends ddn {
   private ho<ciw> c = ho.a(27, ciw.b);
   private final dcx f = new dcx() {
      @Override
      protected void a(cpk $$0, gv $$1, dey $$2) {
         dcd.this.a($$2, aou.bk);
         dcd.this.a($$2, true);
      }

      @Override
      protected void b(cpk $$0, gv $$1, dey $$2) {
         dcd.this.a($$2, aou.bj);
         dcd.this.a($$2, false);
      }

      @Override
      protected void a(cpk $$0, gv $$1, dey $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cbl $$0) {
         if ($$0.bQ instanceof cej) {
            bgh $$1 = ((cej)$$0.bQ).l();
            return $$1 == dcd.this;
         } else {
            return false;
         }
      }
   };

   public dcd(gv $$0, dey $$1) {
      super(dcm.A, $$0, $$1);
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgi.a($$0, this.c);
      }
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.c = ho.a(this.b(), ciw.b);
      if (!this.d($$0)) {
         bgi.b($$0, this.c);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected ho<ciw> f() {
      return this.c;
   }

   @Override
   protected void a(ho<ciw> $$0) {
      this.c = $$0;
   }

   @Override
   protected te g() {
      return te.c("container.barrel");
   }

   @Override
   protected cec a(int $$0, cbk $$1) {
      return cej.a($$0, $$1, this);
   }

   @Override
   public void d_(cbl $$0) {
      if (!this.q && !$$0.G_()) {
         this.f.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cbl $$0) {
      if (!this.q && !$$0.G_()) {
         this.f.b($$0, this.k(), this.p(), this.q());
      }
   }

   public void i() {
      if (!this.q) {
         this.f.c(this.k(), this.p(), this.q());
      }
   }

   void a(dey $$0, boolean $$1) {
      this.o.a(this.p(), $$0.a(crr.b, Boolean.valueOf($$1)), 3);
   }

   void a(dey $$0, aot $$1) {
      ia $$2 = $$0.c(crr.a).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, aov.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}

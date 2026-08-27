public class dce extends ddo {
   private hn<cix> c = hn.a(27, cix.b);
   private final dcy f = new dcy() {
      @Override
      protected void a(cpl $$0, gu $$1, dez $$2) {
         dce.this.a($$2, aow.bk);
         dce.this.a($$2, true);
      }

      @Override
      protected void b(cpl $$0, gu $$1, dez $$2) {
         dce.this.a($$2, aow.bj);
         dce.this.a($$2, false);
      }

      @Override
      protected void a(cpl $$0, gu $$1, dez $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cbm $$0) {
         if ($$0.bQ instanceof cek) {
            bgj $$1 = ((cek)$$0.bQ).l();
            return $$1 == dce.this;
         } else {
            return false;
         }
      }
   };

   public dce(gu $$0, dez $$1) {
      super(dcn.A, $$0, $$1);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgk.a($$0, this.c);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.c = hn.a(this.b(), cix.b);
      if (!this.d($$0)) {
         bgk.b($$0, this.c);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected hn<cix> f() {
      return this.c;
   }

   @Override
   protected void a(hn<cix> $$0) {
      this.c = $$0;
   }

   @Override
   protected tf g() {
      return tf.c("container.barrel");
   }

   @Override
   protected ced a(int $$0, cbl $$1) {
      return cek.a($$0, $$1, this);
   }

   @Override
   public void d_(cbm $$0) {
      if (!this.q && !$$0.G_()) {
         this.f.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cbm $$0) {
      if (!this.q && !$$0.G_()) {
         this.f.b($$0, this.k(), this.p(), this.q());
      }
   }

   public void i() {
      if (!this.q) {
         this.f.c(this.k(), this.p(), this.q());
      }
   }

   void a(dez $$0, boolean $$1) {
      this.o.a(this.p(), $$0.a(crs.b, Boolean.valueOf($$1)), 3);
   }

   void a(dez $$0, aov $$1) {
      hz $$2 = $$0.c(crs.a).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, aox.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}

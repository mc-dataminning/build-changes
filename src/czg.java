public class czg extends daq {
   private hn<cfz> c = hn.a(27, cfz.b);
   private final daa f = new daa() {
      @Override
      protected void a(cmm $$0, gu $$1, dcb $$2) {
         czg.this.a($$2, amh.bk);
         czg.this.a($$2, true);
      }

      @Override
      protected void b(cmm $$0, gu $$1, dcb $$2) {
         czg.this.a($$2, amh.bj);
         czg.this.a($$2, false);
      }

      @Override
      protected void a(cmm $$0, gu $$1, dcb $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(byo $$0) {
         if ($$0.bR instanceof cbm) {
            bdq $$1 = ((cbm)$$0.bR).l();
            return $$1 == czg.this;
         } else {
            return false;
         }
      }
   };

   public czg(gu $$0, dcb $$1) {
      super(czp.A, $$0, $$1);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bdr.a($$0, this.c);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.c = hn.a(this.b(), cfz.b);
      if (!this.d($$0)) {
         bdr.b($$0, this.c);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected hn<cfz> f() {
      return this.c;
   }

   @Override
   protected void a(hn<cfz> $$0) {
      this.c = $$0;
   }

   @Override
   protected sw g() {
      return sw.c("container.barrel");
   }

   @Override
   protected cbf a(int $$0, byn $$1) {
      return cbm.a($$0, $$1, this);
   }

   @Override
   public void d_(byo $$0) {
      if (!this.q && !$$0.G_()) {
         this.f.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(byo $$0) {
      if (!this.q && !$$0.G_()) {
         this.f.b($$0, this.k(), this.p(), this.q());
      }
   }

   public void i() {
      if (!this.q) {
         this.f.c(this.k(), this.p(), this.q());
      }
   }

   void a(dcb $$0, boolean $$1) {
      this.o.a(this.p(), $$0.a(cou.b, Boolean.valueOf($$1)), 3);
   }

   void a(dcb $$0, amg $$1) {
      hz $$2 = $$0.c(cou.a).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, ami.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}

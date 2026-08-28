public class dsk extends dty {
   private jz<cwf> d = jz.a(27, cwf.k);
   private final dte e = new dte() {
      @Override
      protected void a(dff $$0, jh $$1, dvo $$2) {
         dsk.this.a($$2, awo.bz);
         dsk.this.a($$2, true);
      }

      @Override
      protected void b(dff $$0, jh $$1, dvo $$2) {
         dsk.this.a($$2, awo.by);
         dsk.this.a($$2, false);
      }

      @Override
      protected void a(dff $$0, jh $$1, dvo $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cor $$0) {
         if ($$0.cd instanceof csb) {
            bsa $$1 = ((csb)$$0.cd).l();
            return $$1 == dsk.this;
         } else {
            return false;
         }
      }
   };

   public dsk(jh $$0, dvo $$1) {
      super(dst.A, $$0, $$1);
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsb.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d = jz.a(this.b(), cwf.k);
      if (!this.b_($$0)) {
         bsb.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jz<cwf> f() {
      return this.d;
   }

   @Override
   protected void a(jz<cwf> $$0) {
      this.d = $$0;
   }

   @Override
   protected xl j() {
      return xl.c("container.barrel");
   }

   @Override
   protected crs a(int $$0, coq $$1) {
      return csb.a($$0, $$1, this);
   }

   @Override
   public void d_(cor $$0) {
      if (!this.q && !$$0.R_()) {
         this.e.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(cor $$0) {
      if (!this.q && !$$0.R_()) {
         this.e.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void k() {
      if (!this.q) {
         this.e.c(this.i(), this.aB_(), this.m());
      }
   }

   void a(dvo $$0, boolean $$1) {
      this.o.a(this.aB_(), $$0.b(dhp.c, Boolean.valueOf($$1)), 3);
   }

   void a(dvo $$0, awn $$1) {
      kl $$2 = $$0.c(dhp.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, awp.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
   }
}

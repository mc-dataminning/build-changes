public class diq extends dkb {
   private is<cpd> e = is.a(27, cpd.h);
   private final djk f = new djk() {
      @Override
      protected void a(cvr $$0, hz $$1, dlj $$2) {
         diq.this.a($$2, atl.bx);
         diq.this.a($$2, true);
      }

      @Override
      protected void b(cvr $$0, hz $$1, dlj $$2) {
         diq.this.a($$2, atl.bw);
         diq.this.a($$2, false);
      }

      @Override
      protected void a(cvr $$0, hz $$1, dlj $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(chl $$0) {
         if ($$0.bW instanceof ckm) {
            blp $$1 = ((ckm)$$0.bW).l();
            return $$1 == diq.this;
         } else {
            return false;
         }
      }
   };

   public diq(hz $$0, dlj $$1) {
      super(diz.A, $$0, $$1);
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         blq.a($$0, this.e);
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.e = is.a(this.b(), cpd.h);
      if (!this.c_($$0)) {
         blq.b($$0, this.e);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected is<cpd> k() {
      return this.e;
   }

   @Override
   protected void a(is<cpd> $$0) {
      this.e = $$0;
   }

   @Override
   protected vq l() {
      return vq.c("container.barrel");
   }

   @Override
   protected ckf a(int $$0, chk $$1) {
      return ckm.a($$0, $$1, this);
   }

   @Override
   public void d_(chl $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.a($$0, this.i(), this.aE_(), this.r());
      }
   }

   @Override
   public void c(chl $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.b($$0, this.i(), this.aE_(), this.r());
      }
   }

   public void m() {
      if (!this.q) {
         this.f.c(this.i(), this.aE_(), this.r());
      }
   }

   void a(dlj $$0, boolean $$1) {
      this.o.a(this.aE_(), $$0.a(cxy.c, Boolean.valueOf($$1)), 3);
   }

   void a(dlj $$0, atk $$1) {
      jd $$2 = $$0.c(cxy.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, atm.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}

public class dgh extends dhs {
   private iq<cmr> e = iq.a(27, cmr.f);
   private final dhb f = new dhb() {
      @Override
      protected void a(cti $$0, hx $$1, dja $$2) {
         dgh.this.a($$2, arm.bk);
         dgh.this.a($$2, true);
      }

      @Override
      protected void b(cti $$0, hx $$1, dja $$2) {
         dgh.this.a($$2, arm.bj);
         dgh.this.a($$2, false);
      }

      @Override
      protected void a(cti $$0, hx $$1, dja $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cfb $$0) {
         if ($$0.bS instanceof cib) {
            bjo $$1 = ((cib)$$0.bS).l();
            return $$1 == dgh.this;
         } else {
            return false;
         }
      }
   };

   public dgh(hx $$0, dja $$1) {
      super(dgq.A, $$0, $$1);
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjp.a($$0, this.e);
      }
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.e = iq.a(this.b(), cmr.f);
      if (!this.c_($$0)) {
         bjp.b($$0, this.e);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected iq<cmr> k() {
      return this.e;
   }

   @Override
   protected void a(iq<cmr> $$0) {
      this.e = $$0;
   }

   @Override
   protected vd l() {
      return vd.c("container.barrel");
   }

   @Override
   protected chu a(int $$0, cfa $$1) {
      return cib.a($$0, $$1, this);
   }

   @Override
   public void d_(cfb $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.a($$0, this.i(), this.aB_(), this.r());
      }
   }

   @Override
   public void c(cfb $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.b($$0, this.i(), this.aB_(), this.r());
      }
   }

   public void m() {
      if (!this.q) {
         this.f.c(this.i(), this.aB_(), this.r());
      }
   }

   void a(dja $$0, boolean $$1) {
      this.o.a(this.aB_(), $$0.a(cvp.c, Boolean.valueOf($$1)), 3);
   }

   void a(dja $$0, arl $$1) {
      jb $$2 = $$0.c(cvp.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, arn.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}

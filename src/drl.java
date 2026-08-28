public class drl extends dsz {
   private jw<cvp> d = jw.a(27, cvp.k);
   private final dsf e = new dsf() {
      @Override
      protected void a(deg $$0, je $$1, duo $$2) {
         drl.this.a($$2, awe.bz);
         drl.this.a($$2, true);
      }

      @Override
      protected void b(deg $$0, je $$1, duo $$2) {
         drl.this.a($$2, awe.by);
         drl.this.a($$2, false);
      }

      @Override
      protected void a(deg $$0, je $$1, duo $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cnu $$0) {
         if ($$0.bZ instanceof crf) {
            bri $$1 = ((crf)$$0.bZ).l();
            return $$1 == drl.this;
         } else {
            return false;
         }
      }
   };

   public drl(je $$0, duo $$1) {
      super(dru.A, $$0, $$1);
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brj.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.d = jw.a(this.b(), cvp.k);
      if (!this.b_($$0)) {
         brj.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jw<cvp> f() {
      return this.d;
   }

   @Override
   protected void a(jw<cvp> $$0) {
      this.d = $$0;
   }

   @Override
   protected xd j() {
      return xd.c("container.barrel");
   }

   @Override
   protected cqw a(int $$0, cnt $$1) {
      return crf.a($$0, $$1, this);
   }

   @Override
   public void d_(cnu $$0) {
      if (!this.q && !$$0.P_()) {
         this.e.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(cnu $$0) {
      if (!this.q && !$$0.P_()) {
         this.e.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void k() {
      if (!this.q) {
         this.e.c(this.i(), this.aB_(), this.m());
      }
   }

   void a(duo $$0, boolean $$1) {
      this.o.a(this.aB_(), $$0.b(dgp.c, Boolean.valueOf($$1)), 3);
   }

   void a(duo $$0, awd $$1) {
      ki $$2 = $$0.c(dgp.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, awf.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}

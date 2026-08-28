public class dtq extends dvf {
   private ka<cwn> d = ka.a(27, cwn.j);
   private final duk e = new duk() {
      @Override
      protected void a(dgg $$0, ji $$1, dwv $$2) {
         dtq.this.a($$2, avz.bz);
         dtq.this.a($$2, true);
      }

      @Override
      protected void b(dgg $$0, ji $$1, dwv $$2) {
         dtq.this.a($$2, avz.by);
         dtq.this.a($$2, false);
      }

      @Override
      protected void a(dgg $$0, ji $$1, dwv $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cov $$0) {
         if ($$0.cd instanceof csj) {
            bsb $$1 = ((csj)$$0.cd).l();
            return $$1 == dtq.this;
         } else {
            return false;
         }
      }
   };

   public dtq(ji $$0, dwv $$1) {
      super(dtz.B, $$0, $$1);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsc.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.d = ka.a(this.b(), cwn.j);
      if (!this.b_($$0)) {
         bsc.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected ka<cwn> f() {
      return this.d;
   }

   @Override
   protected void a(ka<cwn> $$0) {
      this.d = $$0;
   }

   @Override
   protected wo j() {
      return wo.c("container.barrel");
   }

   @Override
   protected csa a(int $$0, cou $$1) {
      return csj.a($$0, $$1, this);
   }

   @Override
   public void c_(cov $$0) {
      if (!this.q && !$$0.Z_()) {
         this.e.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public void c(cov $$0) {
      if (!this.q && !$$0.Z_()) {
         this.e.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   public void k() {
      if (!this.q) {
         this.e.c(this.i(), this.aA_(), this.m());
      }
   }

   void a(dwv $$0, boolean $$1) {
      this.o.a(this.aA_(), $$0.b(diq.c, Boolean.valueOf($$1)), 3);
   }

   void a(dwv $$0, avy $$1) {
      km $$2 = $$0.c(diq.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, awa.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
   }
}

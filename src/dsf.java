public class dsf extends dtt {
   private jz<cwb> d = jz.a(27, cwb.k);
   private final dsz e = new dsz() {
      @Override
      protected void a(dfb $$0, jh $$1, dvj $$2) {
         dsf.this.a($$2, awl.bz);
         dsf.this.a($$2, true);
      }

      @Override
      protected void b(dfb $$0, jh $$1, dvj $$2) {
         dsf.this.a($$2, awl.by);
         dsf.this.a($$2, false);
      }

      @Override
      protected void a(dfb $$0, jh $$1, dvj $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(com $$0) {
         if ($$0.cd instanceof crx) {
            brw $$1 = ((crx)$$0.cd).l();
            return $$1 == dsf.this;
         } else {
            return false;
         }
      }
   };

   public dsf(jh $$0, dvj $$1) {
      super(dso.A, $$0, $$1);
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brx.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d = jz.a(this.b(), cwb.k);
      if (!this.b_($$0)) {
         brx.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jz<cwb> f() {
      return this.d;
   }

   @Override
   protected void a(jz<cwb> $$0) {
      this.d = $$0;
   }

   @Override
   protected xi j() {
      return xi.c("container.barrel");
   }

   @Override
   protected cro a(int $$0, col $$1) {
      return crx.a($$0, $$1, this);
   }

   @Override
   public void d_(com $$0) {
      if (!this.q && !$$0.R_()) {
         this.e.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(com $$0) {
      if (!this.q && !$$0.R_()) {
         this.e.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void k() {
      if (!this.q) {
         this.e.c(this.i(), this.aB_(), this.m());
      }
   }

   void a(dvj $$0, boolean $$1) {
      this.o.a(this.aB_(), $$0.b(dhk.c, Boolean.valueOf($$1)), 3);
   }

   void a(dvj $$0, awk $$1) {
      kl $$2 = $$0.c(dhk.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, awm.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
   }
}

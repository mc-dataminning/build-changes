public class dly extends dnk {
   private iu<crj> e = iu.a(27, crj.i);
   private final dms f = new dms() {
      @Override
      protected void a(cyx $$0, ib $$1, doz $$2) {
         dly.this.a($$2, aum.bz);
         dly.this.a($$2, true);
      }

      @Override
      protected void b(cyx $$0, ib $$1, doz $$2) {
         dly.this.a($$2, aum.by);
         dly.this.a($$2, false);
      }

      @Override
      protected void a(cyx $$0, ib $$1, doz $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cjt $$0) {
         if ($$0.bY instanceof cmw) {
            bnt $$1 = ((cmw)$$0.bY).l();
            return $$1 == dly.this;
         } else {
            return false;
         }
      }
   };

   public dly(ib $$0, doz $$1) {
      super(dmh.A, $$0, $$1);
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bnu.a($$0, this.e, $$1);
      }
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.e = iu.a(this.b(), crj.i);
      if (!this.a_($$0)) {
         bnu.b($$0, this.e, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected iu<crj> j() {
      return this.e;
   }

   @Override
   protected void a(iu<crj> $$0) {
      this.e = $$0;
   }

   @Override
   protected wg k() {
      return wg.c("container.barrel");
   }

   @Override
   protected cmp a(int $$0, cjs $$1) {
      return cmw.a($$0, $$1, this);
   }

   @Override
   public void d_(cjt $$0) {
      if (!this.q && !$$0.N_()) {
         this.f.a($$0, this.i(), this.aA_(), this.n());
      }
   }

   @Override
   public void c(cjt $$0) {
      if (!this.q && !$$0.N_()) {
         this.f.b($$0, this.i(), this.aA_(), this.n());
      }
   }

   public void l() {
      if (!this.q) {
         this.f.c(this.i(), this.aA_(), this.n());
      }
   }

   void a(doz $$0, boolean $$1) {
      this.o.a(this.aA_(), $$0.a(dbe.c, Boolean.valueOf($$1)), 3);
   }

   void a(doz $$0, aul $$1) {
      jg $$2 = $$0.c(dbe.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, aun.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}

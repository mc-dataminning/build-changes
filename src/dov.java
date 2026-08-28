public class dov extends dqh {
   private jr<cuk> d = jr.a(27, cuk.l);
   private final dpp e = new dpp() {
      @Override
      protected void a(dbt $$0, iz $$1, drx $$2) {
         dov.this.a($$2, avw.bz);
         dov.this.a($$2, true);
      }

      @Override
      protected void b(dbt $$0, iz $$1, drx $$2) {
         dov.this.a($$2, avw.by);
         dov.this.a($$2, false);
      }

      @Override
      protected void a(dbt $$0, iz $$1, drx $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cms $$0) {
         if ($$0.cb instanceof cpw) {
            bqi $$1 = ((cpw)$$0.cb).l();
            return $$1 == dov.this;
         } else {
            return false;
         }
      }
   };

   public dov(iz $$0, drx $$1) {
      super(dpe.A, $$0, $$1);
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqj.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.d = jr.a(this.b(), cuk.l);
      if (!this.a_($$0)) {
         bqj.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jr<cuk> j() {
      return this.d;
   }

   @Override
   protected void a(jr<cuk> $$0) {
      this.d = $$0;
   }

   @Override
   protected xl k() {
      return xl.c("container.barrel");
   }

   @Override
   protected cpp a(int $$0, cmr $$1) {
      return cpw.a($$0, $$1, this);
   }

   @Override
   public void d_(cms $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.a($$0, this.i(), this.aA_(), this.n());
      }
   }

   @Override
   public void c(cms $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.b($$0, this.i(), this.aA_(), this.n());
      }
   }

   public void l() {
      if (!this.p) {
         this.e.c(this.i(), this.aA_(), this.n());
      }
   }

   void a(drx $$0, boolean $$1) {
      this.n.a(this.aA_(), $$0.a(dea.c, Boolean.valueOf($$1)), 3);
   }

   void a(drx $$0, avv $$1) {
      kd $$2 = $$0.c(dea.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, avx.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
   }
}

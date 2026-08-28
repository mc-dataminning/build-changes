public class doz extends dql {
   private jr<cuo> d = jr.a(27, cuo.l);
   private final dpt e = new dpt() {
      @Override
      protected void a(dbx $$0, iz $$1, dsb $$2) {
         doz.this.a($$2, avz.bz);
         doz.this.a($$2, true);
      }

      @Override
      protected void b(dbx $$0, iz $$1, dsb $$2) {
         doz.this.a($$2, avz.by);
         doz.this.a($$2, false);
      }

      @Override
      protected void a(dbx $$0, iz $$1, dsb $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cmw $$0) {
         if ($$0.cb instanceof cqa) {
            bqm $$1 = ((cqa)$$0.cb).l();
            return $$1 == doz.this;
         } else {
            return false;
         }
      }
   };

   public doz(iz $$0, dsb $$1) {
      super(dpi.A, $$0, $$1);
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqn.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.d = jr.a(this.b(), cuo.l);
      if (!this.a_($$0)) {
         bqn.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jr<cuo> j() {
      return this.d;
   }

   @Override
   protected void a(jr<cuo> $$0) {
      this.d = $$0;
   }

   @Override
   protected xo k() {
      return xo.c("container.barrel");
   }

   @Override
   protected cpt a(int $$0, cmv $$1) {
      return cqa.a($$0, $$1, this);
   }

   @Override
   public void d_(cmw $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.a($$0, this.i(), this.ay_(), this.n());
      }
   }

   @Override
   public void c(cmw $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.b($$0, this.i(), this.ay_(), this.n());
      }
   }

   public void l() {
      if (!this.p) {
         this.e.c(this.i(), this.ay_(), this.n());
      }
   }

   void a(dsb $$0, boolean $$1) {
      this.n.a(this.ay_(), $$0.a(dee.c, Boolean.valueOf($$1)), 3);
   }

   void a(dsb $$0, avy $$1) {
      kd $$2 = $$0.c(dee.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, awa.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
   }
}

public class doy extends dqk {
   private jr<cun> d = jr.a(27, cun.l);
   private final dps e = new dps() {
      @Override
      protected void a(dbw $$0, iz $$1, dsa $$2) {
         doy.this.a($$2, avz.bz);
         doy.this.a($$2, true);
      }

      @Override
      protected void b(dbw $$0, iz $$1, dsa $$2) {
         doy.this.a($$2, avz.by);
         doy.this.a($$2, false);
      }

      @Override
      protected void a(dbw $$0, iz $$1, dsa $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cmv $$0) {
         if ($$0.cb instanceof cpz) {
            bql $$1 = ((cpz)$$0.cb).l();
            return $$1 == doy.this;
         } else {
            return false;
         }
      }
   };

   public doy(iz $$0, dsa $$1) {
      super(dph.A, $$0, $$1);
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqm.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.d = jr.a(this.b(), cun.l);
      if (!this.a_($$0)) {
         bqm.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jr<cun> j() {
      return this.d;
   }

   @Override
   protected void a(jr<cun> $$0) {
      this.d = $$0;
   }

   @Override
   protected xo k() {
      return xo.c("container.barrel");
   }

   @Override
   protected cps a(int $$0, cmu $$1) {
      return cpz.a($$0, $$1, this);
   }

   @Override
   public void d_(cmv $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(cmv $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public void l() {
      if (!this.p) {
         this.e.c(this.i(), this.az_(), this.n());
      }
   }

   void a(dsa $$0, boolean $$1) {
      this.n.a(this.az_(), $$0.a(ded.c, Boolean.valueOf($$1)), 3);
   }

   void a(dsa $$0, avy $$1) {
      kd $$2 = $$0.c(ded.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, awa.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
   }
}

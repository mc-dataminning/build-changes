public class dpc extends dqo {
   private jr<cur> d = jr.a(27, cur.l);
   private final dpw e = new dpw() {
      @Override
      protected void a(dca $$0, iz $$1, dse $$2) {
         dpc.this.a($$2, awa.bz);
         dpc.this.a($$2, true);
      }

      @Override
      protected void b(dca $$0, iz $$1, dse $$2) {
         dpc.this.a($$2, awa.by);
         dpc.this.a($$2, false);
      }

      @Override
      protected void a(dca $$0, iz $$1, dse $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cmz $$0) {
         if ($$0.cb instanceof cqd) {
            bqp $$1 = ((cqd)$$0.cb).l();
            return $$1 == dpc.this;
         } else {
            return false;
         }
      }
   };

   public dpc(iz $$0, dse $$1) {
      super(dpl.A, $$0, $$1);
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqq.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.d = jr.a(this.b(), cur.l);
      if (!this.a_($$0)) {
         bqq.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jr<cur> j() {
      return this.d;
   }

   @Override
   protected void a(jr<cur> $$0) {
      this.d = $$0;
   }

   @Override
   protected xp k() {
      return xp.c("container.barrel");
   }

   @Override
   protected cpw a(int $$0, cmy $$1) {
      return cqd.a($$0, $$1, this);
   }

   @Override
   public void d_(cmz $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.a($$0, this.i(), this.ay_(), this.n());
      }
   }

   @Override
   public void c(cmz $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.b($$0, this.i(), this.ay_(), this.n());
      }
   }

   public void l() {
      if (!this.p) {
         this.e.c(this.i(), this.ay_(), this.n());
      }
   }

   void a(dse $$0, boolean $$1) {
      this.n.a(this.ay_(), $$0.a(deh.c, Boolean.valueOf($$1)), 3);
   }

   void a(dse $$0, avz $$1) {
      kd $$2 = $$0.c(deh.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, awb.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
   }
}

public class dpb extends dqn {
   private jr<cuq> d = jr.a(27, cuq.l);
   private final dpv e = new dpv() {
      @Override
      protected void a(dbz $$0, iz $$1, dsd $$2) {
         dpb.this.a($$2, awa.bz);
         dpb.this.a($$2, true);
      }

      @Override
      protected void b(dbz $$0, iz $$1, dsd $$2) {
         dpb.this.a($$2, awa.by);
         dpb.this.a($$2, false);
      }

      @Override
      protected void a(dbz $$0, iz $$1, dsd $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cmy $$0) {
         if ($$0.cb instanceof cqc) {
            bqo $$1 = ((cqc)$$0.cb).l();
            return $$1 == dpb.this;
         } else {
            return false;
         }
      }
   };

   public dpb(iz $$0, dsd $$1) {
      super(dpk.A, $$0, $$1);
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqp.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.d = jr.a(this.b(), cuq.l);
      if (!this.a_($$0)) {
         bqp.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jr<cuq> j() {
      return this.d;
   }

   @Override
   protected void a(jr<cuq> $$0) {
      this.d = $$0;
   }

   @Override
   protected xp k() {
      return xp.c("container.barrel");
   }

   @Override
   protected cpv a(int $$0, cmx $$1) {
      return cqc.a($$0, $$1, this);
   }

   @Override
   public void d_(cmy $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.a($$0, this.i(), this.ay_(), this.n());
      }
   }

   @Override
   public void c(cmy $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.b($$0, this.i(), this.ay_(), this.n());
      }
   }

   public void l() {
      if (!this.p) {
         this.e.c(this.i(), this.ay_(), this.n());
      }
   }

   void a(dsd $$0, boolean $$1) {
      this.n.a(this.ay_(), $$0.a(deg.c, Boolean.valueOf($$1)), 3);
   }

   void a(dsd $$0, avz $$1) {
      kd $$2 = $$0.c(deg.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, awb.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
   }
}

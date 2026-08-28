public class dpa extends dqm {
   private jr<cup> d = jr.a(27, cup.l);
   private final dpu e = new dpu() {
      @Override
      protected void a(dby $$0, iz $$1, dsc $$2) {
         dpa.this.a($$2, awa.bz);
         dpa.this.a($$2, true);
      }

      @Override
      protected void b(dby $$0, iz $$1, dsc $$2) {
         dpa.this.a($$2, awa.by);
         dpa.this.a($$2, false);
      }

      @Override
      protected void a(dby $$0, iz $$1, dsc $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cmx $$0) {
         if ($$0.cb instanceof cqb) {
            bqn $$1 = ((cqb)$$0.cb).l();
            return $$1 == dpa.this;
         } else {
            return false;
         }
      }
   };

   public dpa(iz $$0, dsc $$1) {
      super(dpj.A, $$0, $$1);
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqo.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.d = jr.a(this.b(), cup.l);
      if (!this.a_($$0)) {
         bqo.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jr<cup> j() {
      return this.d;
   }

   @Override
   protected void a(jr<cup> $$0) {
      this.d = $$0;
   }

   @Override
   protected xp k() {
      return xp.c("container.barrel");
   }

   @Override
   protected cpu a(int $$0, cmw $$1) {
      return cqb.a($$0, $$1, this);
   }

   @Override
   public void d_(cmx $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.a($$0, this.i(), this.ay_(), this.n());
      }
   }

   @Override
   public void c(cmx $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.b($$0, this.i(), this.ay_(), this.n());
      }
   }

   public void l() {
      if (!this.p) {
         this.e.c(this.i(), this.ay_(), this.n());
      }
   }

   void a(dsc $$0, boolean $$1) {
      this.n.a(this.ay_(), $$0.a(def.c, Boolean.valueOf($$1)), 3);
   }

   void a(dsc $$0, avz $$1) {
      kd $$2 = $$0.c(def.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, awb.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
   }
}

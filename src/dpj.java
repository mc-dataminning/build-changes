public class dpj extends dqw {
   private js<cud> d = js.a(27, cud.l);
   private final dqd e = new dqd() {
      @Override
      protected void a(dcg $$0, ja $$1, dsl $$2) {
         dpj.this.a($$2, avh.bz);
         dpj.this.a($$2, true);
      }

      @Override
      protected void b(dcg $$0, ja $$1, dsl $$2) {
         dpj.this.a($$2, avh.by);
         dpj.this.a($$2, false);
      }

      @Override
      protected void a(dcg $$0, ja $$1, dsl $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cml $$0) {
         if ($$0.ce instanceof cpq) {
            bqa $$1 = ((cpq)$$0.ce).l();
            return $$1 == dpj.this;
         } else {
            return false;
         }
      }
   };

   public dpj(ja $$0, dsl $$1) {
      super(dps.A, $$0, $$1);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqb.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.d = js.a(this.b(), cud.l);
      if (!this.a_($$0)) {
         bqb.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected js<cud> j() {
      return this.d;
   }

   @Override
   protected void a(js<cud> $$0) {
      this.d = $$0;
   }

   @Override
   protected wu k() {
      return wu.c("container.barrel");
   }

   @Override
   protected cpi a(int $$0, cmk $$1) {
      return cpq.a($$0, $$1, this);
   }

   @Override
   public void d_(cml $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(cml $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public void l() {
      if (!this.p) {
         this.e.c(this.i(), this.az_(), this.n());
      }
   }

   void a(dsl $$0, boolean $$1) {
      this.n.a(this.az_(), $$0.a(deo.c, Boolean.valueOf($$1)), 3);
   }

   void a(dsl $$0, avg $$1) {
      ke $$2 = $$0.c(deo.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, avi.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
   }
}

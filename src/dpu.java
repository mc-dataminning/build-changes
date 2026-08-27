public class dpu extends drm {
   private jj<cuh> d = jj.a(27, cuh.i);
   private final dqp e = new dqp() {
      @Override
      protected void a(dca $$0, ir $$1, dtc $$2) {
         dpu.this.a($$2, avo.bE);
         dpu.this.a($$2, true);
      }

      @Override
      protected void b(dca $$0, ir $$1, dtc $$2) {
         dpu.this.a($$2, avo.bD);
         dpu.this.a($$2, false);
      }

      @Override
      protected void a(dca $$0, ir $$1, dtc $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cly $$0) {
         if ($$0.cq instanceof cpn) {
            bpt $$1 = ((cpn)$$0.cq).l();
            return $$1 == dpu.this;
         } else {
            return false;
         }
      }
   };

   public dpu(ir $$0, dtc $$1) {
      super(dqe.B, $$0, $$1);
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpu.a($$0, this.d, $$1);
      }
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.d = jj.a(this.b(), cuh.i);
      if (!this.a_($$0)) {
         bpu.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jj<cuh> j() {
      return this.d;
   }

   @Override
   protected void a(jj<cuh> $$0) {
      this.d = $$0;
   }

   @Override
   protected xe k() {
      return xe.c("container.barrel");
   }

   @Override
   protected cpg a(int $$0, clx $$1) {
      return cpn.a($$0, $$1, this);
   }

   @Override
   public void d_(cly $$0) {
      if (!this.p && !$$0.O_()) {
         this.e.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(cly $$0) {
      if (!this.p && !$$0.O_()) {
         this.e.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public void l() {
      if (!this.p) {
         this.e.c(this.i(), this.az_(), this.n());
      }
   }

   void a(dtc $$0, boolean $$1) {
      this.n.a(this.az_(), $$0.a(deh.c, Boolean.valueOf($$1)), 3);
   }

   void a(dtc $$0, avn $$1) {
      jv $$2 = $$0.c(deh.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, avq.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
   }
}

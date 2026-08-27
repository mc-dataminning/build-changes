public class dqx extends dqc implements drh {
   private final dqk a = new dqk();
   private final dqp b = new dqp() {
      @Override
      protected void a(dca $$0, ir $$1, dtc $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avo.im, avq.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dca $$0, ir $$1, dtc $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avo.il, avq.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dca $$0, ir $$1, dtc $$2, int $$3, int $$4) {
         $$0.a(dqx.this.o, dfe.gy, 1, $$4);
      }

      @Override
      protected boolean a(cly $$0) {
         return $$0.gA().b(dqx.this);
      }
   };

   public dqx(ir $$0, dtc $$1) {
      super(dqe.e, $$0, $$1);
   }

   public static void a(dca $$0, ir $$1, dtc $$2, dqx $$3) {
      $$3.a.a();
   }

   @Override
   public boolean b_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.a.a($$1 > 0);
         return true;
      } else {
         return super.b_($$0, $$1);
      }
   }

   public void a(cly $$0) {
      if (!this.p && !$$0.O_()) {
         this.b.a($$0, this.i(), this.az_(), this.n());
      }
   }

   public void b(cly $$0) {
      if (!this.p && !$$0.O_()) {
         this.b.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public boolean c(cly $$0) {
      return bpt.a(this, $$0);
   }

   public void b() {
      if (!this.p) {
         this.b.c(this.i(), this.az_(), this.n());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}

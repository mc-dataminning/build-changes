public class drd extends dqh implements drl {
   private final dqp a = new dqp();
   private final dqu b = new dqu() {
      @Override
      protected void a(dcw $$0, jd $$1, dtc $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avp.hZ, avq.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dcw $$0, jd $$1, dtc $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avp.hY, avq.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dcw $$0, jd $$1, dtc $$2, int $$3, int $$4) {
         $$0.a(drd.this.o, dga.fG, 1, $$4);
      }

      @Override
      protected boolean a(cmx $$0) {
         return $$0.gm().b(drd.this);
      }
   };

   public drd(jd $$0, dtc $$1) {
      super(dqj.d, $$0, $$1);
   }

   public static void a(dcw $$0, jd $$1, dtc $$2, drd $$3) {
      $$3.a.a();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.a.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public void a(cmx $$0) {
      if (!this.p && !$$0.R_()) {
         this.b.a($$0, this.i(), this.aD_(), this.n());
      }
   }

   public void b(cmx $$0) {
      if (!this.p && !$$0.R_()) {
         this.b.b($$0, this.i(), this.aD_(), this.n());
      }
   }

   public boolean c(cmx $$0) {
      return bqk.a(this, $$0);
   }

   public void b() {
      if (!this.p) {
         this.b.c(this.i(), this.aD_(), this.n());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}

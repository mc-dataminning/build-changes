public class doh extends dnm implements dop {
   private final dnu a = new dnu();
   private final dnz b = new dnz() {
      @Override
      protected void a(dad $$0, in $$1, dqh $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avc.hU, avd.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dad $$0, in $$1, dqh $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avc.hT, avd.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dad $$0, in $$1, dqh $$2, int $$3, int $$4) {
         $$0.a(doh.this.o, ddg.fG, 1, $$4);
      }

      @Override
      protected boolean a(clh $$0) {
         return $$0.gn().b(doh.this);
      }
   };

   public doh(in $$0, dqh $$1) {
      super(dno.d, $$0, $$1);
   }

   public static void a(dad $$0, in $$1, dqh $$2, doh $$3) {
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

   public void a(clh $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.a($$0, this.i(), this.az_(), this.n());
      }
   }

   public void b(clh $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public boolean c(clh $$0) {
      return bpf.a(this, $$0);
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

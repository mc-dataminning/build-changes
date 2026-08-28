public class dqi extends dpn implements dqq {
   private final dpv a = new dpv();
   private final dqa b = new dqa() {
      @Override
      protected void a(dcd $$0, ja $$1, dsh $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avf.hZ, avg.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dcd $$0, ja $$1, dsh $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avf.hY, avg.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dcd $$0, ja $$1, dsh $$2, int $$3, int $$4) {
         $$0.a(dqi.this.o, dfh.fG, 1, $$4);
      }

      @Override
      protected boolean a(cmh $$0) {
         return $$0.gl().b(dqi.this);
      }
   };

   public dqi(ja $$0, dsh $$1) {
      super(dpp.d, $$0, $$1);
   }

   public static void a(dcd $$0, ja $$1, dsh $$2, dqi $$3) {
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

   public void a(cmh $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.a($$0, this.i(), this.az_(), this.n());
      }
   }

   public void b(cmh $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public boolean c(cmh $$0) {
      return bpw.a(this, $$0);
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

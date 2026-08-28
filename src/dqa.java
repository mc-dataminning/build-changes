public class dqa extends dpf implements dqi {
   private final dpn a = new dpn();
   private final dps b = new dps() {
      @Override
      protected void a(dbw $$0, iz $$1, dsa $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avz.hZ, awa.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dbw $$0, iz $$1, dsa $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avz.hY, awa.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dbw $$0, iz $$1, dsa $$2, int $$3, int $$4) {
         $$0.a(dqa.this.o, dez.fG, 1, $$4);
      }

      @Override
      protected boolean a(cmv $$0) {
         return $$0.gp().b(dqa.this);
      }
   };

   public dqa(iz $$0, dsa $$1) {
      super(dph.d, $$0, $$1);
   }

   public static void a(dbw $$0, iz $$1, dsa $$2, dqa $$3) {
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

   public void a(cmv $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.a($$0, this.i(), this.az_(), this.n());
      }
   }

   public void b(cmv $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public boolean c(cmv $$0) {
      return bql.a(this, $$0);
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

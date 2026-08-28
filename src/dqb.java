public class dqb extends dpg implements dqj {
   private final dpo a = new dpo();
   private final dpt b = new dpt() {
      @Override
      protected void a(dbx $$0, iz $$1, dsb $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avz.hZ, awa.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dbx $$0, iz $$1, dsb $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avz.hY, awa.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dbx $$0, iz $$1, dsb $$2, int $$3, int $$4) {
         $$0.a(dqb.this.o, dfa.fG, 1, $$4);
      }

      @Override
      protected boolean a(cmw $$0) {
         return $$0.gp().b(dqb.this);
      }
   };

   public dqb(iz $$0, dsb $$1) {
      super(dpi.d, $$0, $$1);
   }

   public static void a(dbx $$0, iz $$1, dsb $$2, dqb $$3) {
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

   public void a(cmw $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.a($$0, this.i(), this.ay_(), this.n());
      }
   }

   public void b(cmw $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.b($$0, this.i(), this.ay_(), this.n());
      }
   }

   public boolean c(cmw $$0) {
      return bqm.a(this, $$0);
   }

   public void b() {
      if (!this.p) {
         this.b.c(this.i(), this.ay_(), this.n());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}

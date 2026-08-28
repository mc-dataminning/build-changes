public class dqm extends dpq implements dqu {
   private final dpy a = new dpy();
   private final dqd b = new dqd() {
      @Override
      protected void a(dcg $$0, ja $$1, dsl $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avh.hZ, avi.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dcg $$0, ja $$1, dsl $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avh.hY, avi.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dcg $$0, ja $$1, dsl $$2, int $$3, int $$4) {
         $$0.a(dqm.this.o, dfk.fG, 1, $$4);
      }

      @Override
      protected boolean a(cml $$0) {
         return $$0.gn().b(dqm.this);
      }
   };

   public dqm(ja $$0, dsl $$1) {
      super(dps.d, $$0, $$1);
   }

   public static void a(dcg $$0, ja $$1, dsl $$2, dqm $$3) {
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

   public void a(cml $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.a($$0, this.i(), this.az_(), this.n());
      }
   }

   public void b(cml $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public boolean c(cml $$0) {
      return bqa.a(this, $$0);
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

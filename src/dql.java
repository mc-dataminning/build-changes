public class dql extends dpp implements dqt {
   private final dpx a = new dpx();
   private final dqc b = new dqc() {
      @Override
      protected void a(dcf $$0, ja $$1, dsk $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avh.hZ, avi.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dcf $$0, ja $$1, dsk $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avh.hY, avi.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dcf $$0, ja $$1, dsk $$2, int $$3, int $$4) {
         $$0.a(dql.this.o, dfj.fG, 1, $$4);
      }

      @Override
      protected boolean a(cmk $$0) {
         return $$0.gm().b(dql.this);
      }
   };

   public dql(ja $$0, dsk $$1) {
      super(dpr.d, $$0, $$1);
   }

   public static void a(dcf $$0, ja $$1, dsk $$2, dql $$3) {
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

   public void a(cmk $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.a($$0, this.i(), this.az_(), this.n());
      }
   }

   public void b(cmk $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public boolean c(cmk $$0) {
      return bpz.a(this, $$0);
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

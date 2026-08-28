public class dtu extends dsy implements dud {
   private final dtg a = new dtg();
   private final dtl b = new dtl() {
      @Override
      protected void a(dfm $$0, jh $$1, dvv $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awn.ia, awo.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dfm $$0, jh $$1, dvv $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awn.hZ, awo.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dfm $$0, jh $$1, dvv $$2, int $$3, int $$4) {
         $$0.a(dtu.this.p, dis.fG, 1, $$4);
      }

      @Override
      protected boolean a(cou $$0) {
         return $$0.gu().b(dtu.this);
      }
   };

   public dtu(jh $$0, dvv $$1) {
      super(dta.d, $$0, $$1);
   }

   public static void a(dfm $$0, jh $$1, dvv $$2, dtu $$3) {
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

   public void a(cou $$0) {
      if (!this.q && !$$0.Y_()) {
         this.b.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   public void b(cou $$0) {
      if (!this.q && !$$0.Y_()) {
         this.b.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   public boolean c(cou $$0) {
      return bsd.a(this, $$0);
   }

   public void b() {
      if (!this.q) {
         this.b.c(this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}

public class dfm extends der implements dfu {
   private final dez a = new dez();
   private final dfe b = new dfe() {
      @Override
      protected void a(crs $$0, ht $$1, dgw $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aqn.gW, aqo.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(crs $$0, ht $$1, dgw $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aqn.gV, aqo.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(crs $$0, ht $$1, dgw $$2, int $$3, int $$4) {
         $$0.a(dfm.this.p, cuv.fG, 1, $$4);
      }

      @Override
      protected boolean a(cdm $$0) {
         return $$0.gf().b(dfm.this);
      }
   };

   public dfm(ht $$0, dgw $$1) {
      super(det.d, $$0, $$1);
   }

   public static void a(crs $$0, ht $$1, dgw $$2, dfm $$3) {
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

   public void a(cdm $$0) {
      if (!this.q && !$$0.N_()) {
         this.b.a($$0, this.k(), this.p(), this.q());
      }
   }

   public void b(cdm $$0) {
      if (!this.q && !$$0.N_()) {
         this.b.b($$0, this.k(), this.p(), this.q());
      }
   }

   public boolean c(cdm $$0) {
      return bij.a(this, $$0);
   }

   public void c() {
      if (!this.q) {
         this.b.c(this.k(), this.p(), this.q());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}

public class dzm extends dyo implements dzv {
   private final dyx a = new dyx();
   private final dzc b = new dzc() {
      @Override
      protected void a(dkj $$0, iw $$1, ebq $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awy.ix, awz.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dkj $$0, iw $$1, ebq $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awy.iw, awz.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dkj $$0, iw $$1, ebq $$2, int $$3, int $$4) {
         $$0.a(dzm.this.o, dnq.gf, 1, $$4);
      }

      @Override
      protected boolean a(csi $$0) {
         return $$0.gx().b(dzm.this);
      }
   };

   public dzm(iw $$0, ebq $$1) {
      super(dyq.d, $$0, $$1);
   }

   public static void a(dkj $$0, iw $$1, ebq $$2, dzm $$3) {
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

   public void a(csi $$0) {
      if (!this.p && !$$0.aa_()) {
         this.b.a($$0, this.i(), this.aC_(), this.m());
      }
   }

   public void b(csi $$0) {
      if (!this.p && !$$0.aa_()) {
         this.b.b($$0, this.i(), this.aC_(), this.m());
      }
   }

   public boolean c(csi $$0) {
      return buv.a(this, $$0);
   }

   public void a() {
      if (!this.p) {
         this.b.c(this.i(), this.aC_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}

public class der extends ddx implements dez {
   private final def a = new def();
   private final dek b = new dek() {
      @Override
      protected void a(cqz $$0, ht $$1, dgb $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aqd.gU, aqe.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cqz $$0, ht $$1, dgb $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aqd.gT, aqe.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cqz $$0, ht $$1, dgb $$2, int $$3, int $$4) {
         $$0.a(der.this.p, cuc.fG, 1, $$4);
      }

      @Override
      protected boolean a(ccx $$0) {
         return $$0.gf().b(der.this);
      }
   };

   public der(ht $$0, dgb $$1) {
      super(ddz.d, $$0, $$1);
   }

   public static void a(cqz $$0, ht $$1, dgb $$2, der $$3) {
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

   public void a(ccx $$0) {
      if (!this.q && !$$0.N_()) {
         this.b.a($$0, this.k(), this.p(), this.q());
      }
   }

   public void b(ccx $$0) {
      if (!this.q && !$$0.N_()) {
         this.b.b($$0, this.k(), this.p(), this.q());
      }
   }

   public boolean c(ccx $$0) {
      return bhu.a(this, $$0);
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

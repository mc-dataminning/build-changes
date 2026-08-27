public class ddt extends dcz implements deb {
   private final ddh a = new ddh();
   private final ddm b = new ddm() {
      @Override
      protected void a(cqb $$0, gw $$1, dfd $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, apg.gS, aph.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cqb $$0, gw $$1, dfd $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, apg.gR, aph.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cqb $$0, gw $$1, dfd $$2, int $$3, int $$4) {
         $$0.a(ddt.this.p, cte.fG, 1, $$4);
      }

      @Override
      protected boolean a(cca $$0) {
         return $$0.gf().b(ddt.this);
      }
   };

   public ddt(gw $$0, dfd $$1) {
      super(ddb.d, $$0, $$1);
   }

   public static void a(cqb $$0, gw $$1, dfd $$2, ddt $$3) {
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

   public void a(cca $$0) {
      if (!this.q && !$$0.M_()) {
         this.b.a($$0, this.k(), this.p(), this.q());
      }
   }

   public void b(cca $$0) {
      if (!this.q && !$$0.M_()) {
         this.b.b($$0, this.k(), this.p(), this.q());
      }
   }

   public boolean c(cca $$0) {
      return bgx.a(this, $$0);
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

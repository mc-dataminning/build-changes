public class cec extends cdy {
   private int e = 1;

   public cec(bkm<? extends cec> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cec(crs $$0, bky $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bkm.ag, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(ejg $$0) {
      super.a($$0);
      if (!this.dL().B) {
         boolean $$1 = this.dL().X().b(cro.c);
         this.dL().a(this, this.dq(), this.ds(), this.dw(), (float)this.e, $$1, crs.a.c);
         this.ak();
      }
   }

   @Override
   protected void a(ejf $$0) {
      super.a($$0);
      if (!this.dL().B) {
         bki $$1 = $$0.a();
         bki $$2 = this.v();
         $$1.a(this.dM().a((cdy)this, $$2), 6.0F);
         if ($$2 instanceof bky) {
            this.a((bky)$$2, $$1);
         }
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

public class ccm extends cci {
   private int e = 1;

   public ccm(biw<? extends ccm> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public ccm(cpx $$0, bji $$1, double $$2, double $$3, double $$4, int $$5) {
      super(biw.ag, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(ehn $$0) {
      super.a($$0);
      if (!this.dL().B) {
         boolean $$1 = this.dL().X().b(cpt.c);
         this.dL().a(this, this.dq(), this.ds(), this.dw(), (float)this.e, $$1, cpx.a.c);
         this.ak();
      }
   }

   @Override
   protected void a(ehm $$0) {
      super.a($$0);
      if (!this.dL().B) {
         bis $$1 = $$0.a();
         bis $$2 = this.v();
         $$1.a(this.dM().a((cci)this, $$2), 6.0F);
         if ($$2 instanceof bji) {
            this.a((bji)$$2, $$1);
         }
      }
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

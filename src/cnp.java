public class cnp extends cnl {
   private int g = 1;

   public cnp(btc<? extends cnp> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cnp(dca $$0, btr $$1, double $$2, double $$3, double $$4, int $$5) {
      super(btc.ak, $$1, $$2, $$3, $$4, $$0);
      this.g = $$5;
   }

   @Override
   protected void a(evr $$0) {
      super.a($$0);
      if (!this.dP().B) {
         boolean $$1 = this.dP().ab().b(dbw.c);
         this.dP().a(this, this.du(), this.dw(), this.dA(), (float)this.g, $$1, dca.a.c);
         this.ao();
      }
   }

   @Override
   protected void a(evq $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bsw $$1 = $$0.a();
         bsw $$2 = this.s();
         $$1.a(this.dQ().a((cnl)this, $$2), 6.0F);
         if ($$2 instanceof btr) {
            this.a((btr)$$2, $$1);
         }
      }
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.g);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.g = $$0.f("ExplosionPower");
      }
   }
}

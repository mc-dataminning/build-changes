public class cnn extends cnj {
   private int g = 1;

   public cnn(bta<? extends cnn> $$0, dby $$1) {
      super($$0, $$1);
   }

   public cnn(dby $$0, btp $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bta.ak, $$1, $$2, $$3, $$4, $$0);
      this.g = $$5;
   }

   @Override
   protected void a(evp $$0) {
      super.a($$0);
      if (!this.dP().B) {
         boolean $$1 = this.dP().ab().b(dbu.c);
         this.dP().a(this, this.du(), this.dw(), this.dA(), (float)this.g, $$1, dby.a.c);
         this.ao();
      }
   }

   @Override
   protected void a(evo $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bsu $$1 = $$0.a();
         bsu $$2 = this.s();
         $$1.a(this.dQ().a((cnj)this, $$2), 6.0F);
         if ($$2 instanceof btp) {
            this.a((btp)$$2, $$1);
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

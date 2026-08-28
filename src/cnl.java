public class cnl extends cnh {
   private int f = 1;

   public cnl(bsy<? extends cnl> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public cnl(dbw $$0, btn $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bsy.ak, $$1, $$2, $$3, $$4, $$0);
      this.f = $$5;
   }

   @Override
   protected void a(evn $$0) {
      super.a($$0);
      if (!this.dP().B) {
         boolean $$1 = this.dP().ab().b(dbs.c);
         this.dP().a(this, this.du(), this.dw(), this.dA(), (float)this.f, $$1, dbw.a.c);
         this.ao();
      }
   }

   @Override
   protected void a(evm $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bss $$1 = $$0.a();
         bss $$2 = this.s();
         $$1.a(this.dQ().a((cnh)this, $$2), 6.0F);
         if ($$2 instanceof btn) {
            this.a((btn)$$2, $$1);
         }
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.f);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.f = $$0.f("ExplosionPower");
      }
   }
}

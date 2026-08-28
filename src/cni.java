public class cni extends cne {
   private int f = 1;

   public cni(bsv<? extends cni> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public cni(dbt $$0, btk $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bsv.ak, $$1, $$2, $$3, $$4, $$0);
      this.f = $$5;
   }

   @Override
   protected void a(evk $$0) {
      super.a($$0);
      if (!this.dP().B) {
         boolean $$1 = this.dP().ab().b(dbp.c);
         this.dP().a(this, this.du(), this.dw(), this.dA(), (float)this.f, $$1, dbt.a.c);
         this.ao();
      }
   }

   @Override
   protected void a(evj $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bsp $$1 = $$0.a();
         bsp $$2 = this.s();
         $$1.a(this.dQ().a((cne)this, $$2), 6.0F);
         if ($$2 instanceof btk) {
            this.a((btk)$$2, $$1);
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

public class ccf extends ccb {
   private int e = 1;

   public ccf(bip<? extends ccf> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public ccf(cpq $$0, bjb $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bip.ag, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(ehg $$0) {
      super.a($$0);
      if (!this.dK().B) {
         boolean $$1 = this.dK().X().b(cpm.c);
         this.dK().a(this, this.dp(), this.dr(), this.dv(), (float)this.e, $$1, cpq.a.c);
         this.ak();
      }
   }

   @Override
   protected void a(ehf $$0) {
      super.a($$0);
      if (!this.dK().B) {
         bil $$1 = $$0.a();
         bil $$2 = this.v();
         $$1.a(this.dL().a((ccb)this, $$2), 6.0F);
         if ($$2 instanceof bjb) {
            this.a((bjb)$$2, $$1);
         }
      }
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

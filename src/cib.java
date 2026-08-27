public class cib extends chx {
   private int e = 1;

   public cib(bnw<? extends cib> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public cib(cvr $$0, boi $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bnw.ai, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(enx $$0) {
      super.a($$0);
      if (!this.dM().B) {
         boolean $$1 = this.dM().Z().b(cvn.c);
         this.dM().a(this, this.dr(), this.dt(), this.dx(), (float)this.e, $$1, cvr.a.c);
         this.am();
      }
   }

   @Override
   protected void a(enw $$0) {
      super.a($$0);
      if (!this.dM().B) {
         bnq $$1 = $$0.a();
         bnq $$2 = this.w();
         $$1.a(this.dN().a((chx)this, $$2), 6.0F);
         if ($$2 instanceof boi) {
            this.a((boi)$$2, $$1);
         }
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

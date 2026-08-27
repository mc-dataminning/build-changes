public class ckq extends ckm {
   private int e = 1;

   public ckq(bqg<? extends ckq> $$0, czg $$1) {
      super($$0, $$1);
   }

   public ckq(czg $$0, bqt $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bqg.aj, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(esh $$0) {
      super.a($$0);
      if (!this.dM().B) {
         boolean $$1 = this.dM().aa().b(czc.c);
         this.dM().a(this, this.dr(), this.dt(), this.dx(), (float)this.e, $$1, czg.a.c);
         this.am();
      }
   }

   @Override
   protected void a(esg $$0) {
      super.a($$0);
      if (!this.dM().B) {
         bqa $$1 = $$0.a();
         bqa $$2 = this.u();
         $$1.a(this.dN().a((ckm)this, $$2), 6.0F);
         if ($$2 instanceof bqt) {
            this.a((bqt)$$2, $$1);
         }
      }
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

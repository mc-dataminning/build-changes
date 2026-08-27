public class cji extends cje {
   private int e = 1;

   public cji(bpc<? extends cji> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public cji(cwz $$0, bpo $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bpc.aj, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(epp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         boolean $$1 = this.dM().Z().b(cwv.c);
         this.dM().a(this, this.dr(), this.dt(), this.dx(), (float)this.e, $$1, cwz.a.c);
         this.am();
      }
   }

   @Override
   protected void a(epo $$0) {
      super.a($$0);
      if (!this.dM().B) {
         bow $$1 = $$0.a();
         bow $$2 = this.af_();
         $$1.a(this.dN().a((cje)this, $$2), 6.0F);
         if ($$2 instanceof bpo) {
            this.a((bpo)$$2, $$1);
         }
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

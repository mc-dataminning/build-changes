public class ccd extends cbz {
   private int e = 1;

   public ccd(bim<? extends ccd> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public ccd(cpm $$0, biy $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bim.ag, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(ehc $$0) {
      super.a($$0);
      if (!this.dK().B) {
         boolean $$1 = this.dK().X().b(cpi.c);
         this.dK().a(this, this.dp(), this.dr(), this.dv(), (float)this.e, $$1, cpm.a.c);
         this.ak();
      }
   }

   @Override
   protected void a(ehb $$0) {
      super.a($$0);
      if (!this.dK().B) {
         bii $$1 = $$0.a();
         bii $$2 = this.v();
         $$1.a(this.dL().a((cbz)this, $$2), 6.0F);
         if ($$2 instanceof biy) {
            this.a((biy)$$2, $$1);
         }
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

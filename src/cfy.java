public class cfy extends cfu {
   private int e = 1;

   public cfy(blz<? extends cfy> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public cfy(ctp $$0, bml $$1, double $$2, double $$3, double $$4, int $$5) {
      super(blz.ah, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(elr $$0) {
      super.a($$0);
      if (!this.dM().B) {
         boolean $$1 = this.dM().Z().b(ctl.c);
         this.dM().a(this, this.dr(), this.dt(), this.dx(), (float)this.e, $$1, ctp.a.c);
         this.am();
      }
   }

   @Override
   protected void a(elq $$0) {
      super.a($$0);
      if (!this.dM().B) {
         blv $$1 = $$0.a();
         blv $$2 = this.w();
         $$1.a(this.dN().a((cfu)this, $$2), 6.0F);
         if ($$2 instanceof bml) {
            this.a((bml)$$2, $$1);
         }
      }
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

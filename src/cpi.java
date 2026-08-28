public class cpi extends cpe {
   private int e = 1;

   public cpi(bup<? extends cpi> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpi(dff $$0, bve $$1, ezr $$2, int $$3) {
      super(bup.ak, $$1, $$2, $$0);
      this.e = $$3;
   }

   @Override
   protected void a(ezp $$0) {
      super.a($$0);
      if (!this.dY().C) {
         boolean $$1 = this.dY().ac().b(dfb.c);
         this.dY().a(this, this.dD(), this.dF(), this.dJ(), (float)this.e, $$1, dff.a.c);
         this.av();
      }
   }

   @Override
   protected void a(ezo $$0) {
      super.a($$0);
      if (this.dY() instanceof arq $$1) {
         bui var6 = $$0.a();
         bui $$4 = this.s();
         bsy $$5 = this.dZ().a((cpe)this, $$4);
         var6.a($$5, 6.0F);
         dby.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

public class cpe extends cpa {
   private int e = 1;

   public cpe(bul<? extends cpe> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cpe(dfb $$0, bva $$1, ezn $$2, int $$3) {
      super(bul.ak, $$1, $$2, $$0);
      this.e = $$3;
   }

   @Override
   protected void a(ezl $$0) {
      super.a($$0);
      if (!this.dX().C) {
         boolean $$1 = this.dX().ac().b(dex.c);
         this.dX().a(this, this.dC(), this.dE(), this.dI(), (float)this.e, $$1, dfb.a.c);
         this.av();
      }
   }

   @Override
   protected void a(ezk $$0) {
      super.a($$0);
      if (this.dX() instanceof arn $$1) {
         bue var6 = $$0.a();
         bue $$4 = this.s();
         bsu $$5 = this.dY().a((cpa)this, $$4);
         var6.a($$5, 6.0F);
         dbu.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

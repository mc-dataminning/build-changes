public class crv extends crr {
   private int d = 1;

   public crv(bwo<? extends crv> $$0, dja $$1) {
      super($$0, $$1);
   }

   public crv(dja $$0, bxe $$1, feq $$2, int $$3) {
      super(bwo.Y, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(feo $$0) {
      super.a($$0);
      if (this.dV() instanceof arq $$1) {
         boolean $$2 = $$1.O().c(diw.d);
         this.dV().a(this, this.dA(), this.dC(), this.dG(), (float)this.d, $$2, dja.a.c);
         this.at();
      }
   }

   @Override
   protected void a(fen $$0) {
      super.a($$0);
      if (this.dV() instanceof arq $$1) {
         bwf var6 = $$0.a();
         bwf $$4 = this.q();
         buu $$5 = this.dW().a((crr)this, $$4);
         var6.a($$1, $$5, 6.0F);
         dfs.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.d);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.d = $$0.f("ExplosionPower");
      }
   }
}

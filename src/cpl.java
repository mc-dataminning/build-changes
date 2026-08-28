public class cpl extends cph {
   private int d = 1;

   public cpl(bus<? extends cpl> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public cpl(dfm $$0, bvh $$1, ezy $$2, int $$3) {
      super(bus.X, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(ezw $$0) {
      super.a($$0);
      if (this.dV() instanceof arp $$1) {
         boolean $$2 = $$1.N().b(dfi.c);
         this.dV().a(this, this.dA(), this.dC(), this.dG(), (float)this.d, $$2, dfm.a.c);
         this.at();
      }
   }

   @Override
   protected void a(ezv $$0) {
      super.a($$0);
      if (this.dV() instanceof arp $$1) {
         bul var6 = $$0.a();
         bul $$4 = this.p();
         btb $$5 = this.dW().a((cph)this, $$4);
         var6.a($$1, $$5, 6.0F);
         dcf.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.d);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.d = $$0.f("ExplosionPower");
      }
   }
}

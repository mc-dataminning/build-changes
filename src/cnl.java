public class cnl extends cnh {
   private int e = 1;

   public cnl(bsw<? extends cnl> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cnl(dcu $$0, btl $$1, eww $$2, int $$3) {
      super(bsw.ak, $$1, $$2, $$0);
      this.e = $$3;
   }

   @Override
   protected void a(ewu $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         boolean $$1 = this.dQ().ab().b(dcq.c);
         this.dQ().a(this, this.dv(), this.dx(), this.dB(), (float)this.e, $$1, dcu.a.c);
         this.aq();
      }
   }

   @Override
   protected void a(ewt $$0) {
      super.a($$0);
      if (this.dQ() instanceof aqt $$1) {
         bsq var6 = $$0.a();
         bsq $$4 = this.s();
         brj $$5 = this.dR().a((cnh)this, $$4);
         var6.a($$5, 6.0F);
         dac.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

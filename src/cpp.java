public class cpp extends cpl {
   private int d = 1;

   public cpp(but<? extends cpp> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public cpp(dgj $$0, bvi $$1, fbb $$2, int $$3) {
      super(but.Y, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(faz $$0) {
      super.a($$0);
      if (this.dV() instanceof ard $$1) {
         boolean $$2 = $$1.O().b(dgf.c);
         this.dV().a(this, this.dA(), this.dC(), this.dG(), (float)this.d, $$2, dgj.a.c);
         this.at();
      }
   }

   @Override
   protected void a(fay $$0) {
      super.a($$0);
      if (this.dV() instanceof ard $$1) {
         bum var6 = $$0.a();
         bum $$4 = this.p();
         btc $$5 = this.dW().a((cpl)this, $$4);
         var6.a($$1, $$5, 6.0F);
         ddc.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.d);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.d = $$0.f("ExplosionPower");
      }
   }
}

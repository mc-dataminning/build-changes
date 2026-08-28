public class crq extends crm {
   private int d = 1;

   public crq(bwm<? extends crq> $$0, div $$1) {
      super($$0, $$1);
   }

   public crq(div $$0, bxc $$1, fei $$2, int $$3) {
      super(bwm.Y, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(feg $$0) {
      super.a($$0);
      if (this.dV() instanceof arq $$1) {
         boolean $$2 = $$1.O().c(dir.c);
         this.dV().a(this, this.dA(), this.dC(), this.dG(), (float)this.d, $$2, div.a.c);
         this.at();
      }
   }

   @Override
   protected void a(fef $$0) {
      super.a($$0);
      if (this.dV() instanceof arq $$1) {
         bwd var6 = $$0.a();
         bwd $$4 = this.q();
         bus $$5 = this.dW().a((crm)this, $$4);
         var6.a($$1, $$5, 6.0F);
         dfn.a($$1, var6, $$5);
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

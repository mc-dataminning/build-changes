public class cqz extends cqv {
   private int d = 1;

   public cqz(bwb<? extends cqz> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public cqz(dhp $$0, bwr $$1, fcu $$2, int $$3) {
      super(bwb.Y, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(fcs $$0) {
      super.a($$0);
      if (this.dV() instanceof arn $$1) {
         boolean $$2 = $$1.O().c(dhl.c);
         this.dV().a(this, this.dA(), this.dC(), this.dG(), (float)this.d, $$2, dhp.a.c);
         this.at();
      }
   }

   @Override
   protected void a(fcr $$0) {
      super.a($$0);
      if (this.dV() instanceof arn $$1) {
         bvs var6 = $$0.a();
         bvs $$4 = this.q();
         buh $$5 = this.dW().a((cqv)this, $$4);
         var6.a($$1, $$5, 6.0F);
         dej.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.d);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.d = $$0.f("ExplosionPower");
      }
   }
}

public class cqf extends cqb {
   private int d = 1;

   public cqf(bvi<? extends cqf> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqf(dgz $$0, bvx $$1, fbr $$2, int $$3) {
      super(bvi.Z, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(fbp $$0) {
      super.a($$0);
      if (this.dW() instanceof arx $$1) {
         boolean $$2 = $$1.O().b(dgv.c);
         this.dW().a(this, this.dB(), this.dD(), this.dH(), (float)this.d, $$2, dgz.a.c);
         this.at();
      }
   }

   @Override
   protected void a(fbo $$0) {
      super.a($$0);
      if (this.dW() instanceof arx $$1) {
         bvb var6 = $$0.a();
         bvb $$4 = this.p();
         btr $$5 = this.dX().a((cqb)this, $$4);
         var6.a($$1, $$5, 6.0F);
         dds.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.d);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.d = $$0.f("ExplosionPower");
      }
   }
}

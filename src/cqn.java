public class cqn extends cqj {
   private int d = 1;

   public cqn(bvq<? extends cqn> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public cqn(dhh $$0, bwf $$1, fbx $$2, int $$3) {
      super(bvq.Z, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (this.dW() instanceof ash $$1) {
         boolean $$2 = $$1.N().b(dhd.c);
         this.dW().a(this, this.dB(), this.dD(), this.dH(), (float)this.d, $$2, dhh.a.c);
         this.at();
      }
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      if (this.dW() instanceof ash $$1) {
         bvj var6 = $$0.a();
         bvj $$4 = this.p();
         btz $$5 = this.dX().a((cqj)this, $$4);
         var6.a($$1, $$5, 6.0F);
         dea.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.d);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.d = $$0.f("ExplosionPower");
      }
   }
}

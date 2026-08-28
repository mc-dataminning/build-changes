public class cqi extends cqe {
   private int d = 1;

   public cqi(bvi<? extends cqi> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqi(dgz $$0, bvy $$1, fbx $$2, int $$3) {
      super(bvi.Y, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (this.dU() instanceof ard $$1) {
         boolean $$2 = $$1.O().b(dgv.c);
         this.dU().a(this, this.dz(), this.dB(), this.dF(), (float)this.d, $$2, dgz.a.c);
         this.at();
      }
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      if (this.dU() instanceof ard $$1) {
         bva var6 = $$0.a();
         bva $$4 = this.q();
         btp $$5 = this.dV().a((cqe)this, $$4);
         var6.a($$1, $$5, 6.0F);
         ddt.a($$1, var6, $$5);
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

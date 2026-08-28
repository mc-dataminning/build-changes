public class cqj extends cqf {
   private int d = 1;

   public cqj(bvm<? extends cqj> $$0, dha $$1) {
      super($$0, $$1);
   }

   public cqj(dha $$0, bwb $$1, fbs $$2, int $$3) {
      super(bvm.Z, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(fbq $$0) {
      super.a($$0);
      if (this.dV() instanceof ash $$1) {
         boolean $$2 = $$1.N().b(dgw.c);
         this.dV().a(this, this.dA(), this.dC(), this.dG(), (float)this.d, $$2, dha.a.c);
         this.at();
      }
   }

   @Override
   protected void a(fbp $$0) {
      super.a($$0);
      if (this.dV() instanceof ash $$1) {
         bvf var6 = $$0.a();
         bvf $$4 = this.p();
         btv $$5 = this.dW().a((cqf)this, $$4);
         var6.a($$1, $$5, 6.0F);
         ddt.a($$1, var6, $$5);
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

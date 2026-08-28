public class cpo extends cpk {
   private int d = 1;

   public cpo(bus<? extends cpo> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cpo(dgi $$0, bvh $$1, fba $$2, int $$3) {
      super(bus.Y, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(fay $$0) {
      super.a($$0);
      if (this.dV() instanceof ard $$1) {
         boolean $$2 = $$1.O().b(dge.c);
         this.dV().a(this, this.dA(), this.dC(), this.dG(), (float)this.d, $$2, dgi.a.c);
         this.at();
      }
   }

   @Override
   protected void a(fax $$0) {
      super.a($$0);
      if (this.dV() instanceof ard $$1) {
         bul var6 = $$0.a();
         bul $$4 = this.p();
         btb $$5 = this.dW().a((cpk)this, $$4);
         var6.a($$1, $$5, 6.0F);
         ddb.a($$1, var6, $$5);
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

public class crk extends crg {
   private int d = 1;

   public crk(bwj<? extends crk> $$0, dip $$1) {
      super($$0, $$1);
   }

   public crk(dip $$0, bwz $$1, fdw $$2, int $$3) {
      super(bwj.Y, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(fdu $$0) {
      super.a($$0);
      if (this.dV() instanceof aro $$1) {
         boolean $$2 = $$1.O().c(dil.c);
         this.dV().a(this, this.dA(), this.dC(), this.dG(), (float)this.d, $$2, dip.a.c);
         this.at();
      }
   }

   @Override
   protected void a(fdt $$0) {
      super.a($$0);
      if (this.dV() instanceof aro $$1) {
         bwa var6 = $$0.a();
         bwa $$4 = this.q();
         bup $$5 = this.dW().a((crg)this, $$4);
         var6.a($$1, $$5, 6.0F);
         dfh.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.d);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.d = $$0.f("ExplosionPower");
      }
   }
}

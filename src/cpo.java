public class cpo extends cpk {
   private int d = 1;

   public cpo(bur<? extends cpo> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cpo(dgi $$0, bvg $$1, fba $$2, int $$3) {
      super(bur.Z, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(fay $$0) {
      super.a($$0);
      if (this.dW() instanceof arc $$1) {
         boolean $$2 = $$1.O().b(dge.c);
         this.dW().a(this, this.dB(), this.dD(), this.dH(), (float)this.d, $$2, dgi.a.c);
         this.at();
      }
   }

   @Override
   protected void a(fax $$0) {
      super.a($$0);
      if (this.dW() instanceof arc $$1) {
         buk var6 = $$0.a();
         buk $$4 = this.p();
         bta $$5 = this.dX().a((cpk)this, $$4);
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

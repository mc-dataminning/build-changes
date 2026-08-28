public class cpm extends cpi {
   private int d = 1;

   public cpm(buq<? extends cpm> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public cpm(dgg $$0, bvf $$1, fay $$2, int $$3) {
      super(buq.Y, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if (this.dW() instanceof arc $$1) {
         boolean $$2 = $$1.O().b(dgc.c);
         this.dW().a(this, this.dB(), this.dD(), this.dH(), (float)this.d, $$2, dgg.a.c);
         this.at();
      }
   }

   @Override
   protected void a(fav $$0) {
      super.a($$0);
      if (this.dW() instanceof arc $$1) {
         buj var6 = $$0.a();
         buj $$4 = this.p();
         bsz $$5 = this.dX().a((cpi)this, $$4);
         var6.a($$1, $$5, 6.0F);
         dcz.a($$1, var6, $$5);
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

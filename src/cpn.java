public class cpn extends cpj {
   private int d = 1;

   public cpn(bur<? extends cpn> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public cpn(dgh $$0, bvg $$1, faz $$2, int $$3) {
      super(bur.Y, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(fax $$0) {
      super.a($$0);
      if (this.dV() instanceof ard $$1) {
         boolean $$2 = $$1.O().b(dgd.c);
         this.dV().a(this, this.dA(), this.dC(), this.dG(), (float)this.d, $$2, dgh.a.c);
         this.at();
      }
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if (this.dV() instanceof ard $$1) {
         buk var6 = $$0.a();
         buk $$4 = this.p();
         bta $$5 = this.dW().a((cpj)this, $$4);
         var6.a($$1, $$5, 6.0F);
         dda.a($$1, var6, $$5);
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

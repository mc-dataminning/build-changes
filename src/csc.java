public class csc extends cry {
   private int d = 1;

   public csc(bwr<? extends csc> $$0, djh $$1) {
      super($$0, $$1);
   }

   public csc(djh $$0, bxj $$1, fex $$2, int $$3) {
      super(bwr.Y, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(fev $$0) {
      super.a($$0);
      if (this.dU() instanceof arq $$1) {
         boolean $$2 = $$1.O().c(djd.d);
         this.dU().a(this, this.dz(), this.dB(), this.dF(), (float)this.d, $$2, djh.a.c);
         this.aq();
      }
   }

   @Override
   protected void a(feu $$0) {
      super.a($$0);
      if (this.dU() instanceof arq $$1) {
         bwi var6 = $$0.a();
         bwi $$4 = this.q();
         bux $$5 = this.dV().a((cry)this, $$4);
         var6.a($$1, $$5, 6.0F);
         dfz.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.d);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.d = $$0.d("ExplosionPower");
      }
   }
}

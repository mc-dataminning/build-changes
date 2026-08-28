public class csf extends csb {
   private int d = 1;

   public csf(bwr<? extends csf> $$0, djm $$1) {
      super($$0, $$1);
   }

   public csf(djm $$0, bxj $$1, ffc $$2, int $$3) {
      super(bwr.Y, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(ffa $$0) {
      super.a($$0);
      if (this.dU() instanceof arq $$1) {
         boolean $$2 = $$1.O().c(dji.d);
         this.dU().a(this, this.dz(), this.dB(), this.dF(), (float)this.d, $$2, djm.a.c);
         this.aq();
      }
   }

   @Override
   protected void a(fez $$0) {
      super.a($$0);
      if (this.dU() instanceof arq $$1) {
         bwi var6 = $$0.a();
         bwi $$4 = this.q();
         bux $$5 = this.dV().a((csb)this, $$4);
         var6.a($$1, $$5, 6.0F);
         dgc.a($$1, var6, $$5);
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

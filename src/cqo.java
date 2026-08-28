public class cqo extends cqk {
   private int d = 1;

   public cqo(bvr<? extends cqo> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public cqo(dhi $$0, bwg $$1, fby $$2, int $$3) {
      super(bvr.Z, $$1, $$2, $$0);
      this.d = $$3;
   }

   @Override
   protected void a(fbw $$0) {
      super.a($$0);
      if (this.dW() instanceof ash $$1) {
         boolean $$2 = $$1.N().b(dhe.c);
         this.dW().a(this, this.dB(), this.dD(), this.dH(), (float)this.d, $$2, dhi.a.c);
         this.at();
      }
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (this.dW() instanceof ash $$1) {
         bvk var6 = $$0.a();
         bvk $$4 = this.p();
         bua $$5 = this.dX().a((cqk)this, $$4);
         var6.a($$1, $$5, 6.0F);
         deb.a($$1, var6, $$5);
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

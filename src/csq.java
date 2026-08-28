public class csq extends csm {
   private static final byte d = 1;
   private int e = 1;

   public csq(bxc<? extends csq> $$0, djx $$1) {
      super($$0, $$1);
   }

   public csq(djx $$0, bxu $$1, ffq $$2, int $$3) {
      super(bxc.Z, $$1, $$2, $$0);
      this.e = $$3;
   }

   @Override
   protected void a(ffo $$0) {
      super.a($$0);
      if (this.dV() instanceof ars $$1) {
         boolean $$2 = $$1.O().c(djt.d);
         this.dV().a(this, this.dA(), this.dC(), this.dG(), (float)this.e, $$2, djx.a.c);
         this.aq();
      }
   }

   @Override
   protected void a(ffn $$0) {
      super.a($$0);
      if (this.dV() instanceof ars $$1) {
         bwt var6 = $$0.a();
         bwt $$4 = this.q();
         bvi $$5 = this.dW().a((csm)this, $$4);
         var6.a($$1, $$5, 6.0F);
         dgn.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.e = $$0.b("ExplosionPower", (byte)1);
   }
}

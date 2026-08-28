public class ctb extends csx {
   private static final byte d = 1;
   private int e = 1;

   public ctb(bxn<? extends ctb> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public ctb(dkj $$0, byf $$1, fgc $$2, int $$3) {
      super(bxn.Z, $$1, $$2, $$0);
      this.e = $$3;
   }

   @Override
   protected void a(fga $$0) {
      super.a($$0);
      if (this.dV() instanceof asb $$1) {
         boolean $$2 = $$1.O().c(dkf.d);
         this.dV().a(this, this.dA(), this.dC(), this.dG(), (float)this.e, $$2, dkj.a.c);
         this.aq();
      }
   }

   @Override
   protected void a(ffz $$0) {
      super.a($$0);
      if (this.dV() instanceof asb $$1) {
         bxe var6 = $$0.a();
         bxe $$4 = this.q();
         bvt $$5 = this.dW().a((csx)this, $$4);
         var6.a($$1, $$5, 6.0F);
         dgz.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.e = $$0.b("ExplosionPower", (byte)1);
   }
}

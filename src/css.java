public class css extends cso {
   private static final byte d = 1;
   private int e = 1;

   public css(bxe<? extends css> $$0, djz $$1) {
      super($$0, $$1);
   }

   public css(djz $$0, bxw $$1, ffs $$2, int $$3) {
      super(bxe.Z, $$1, $$2, $$0);
      this.e = $$3;
   }

   @Override
   protected void a(ffq $$0) {
      super.a($$0);
      if (this.dV() instanceof aru $$1) {
         boolean $$2 = $$1.O().c(djv.d);
         this.dV().a(this, this.dA(), this.dC(), this.dG(), (float)this.e, $$2, djz.a.c);
         this.aq();
      }
   }

   @Override
   protected void a(ffp $$0) {
      super.a($$0);
      if (this.dV() instanceof aru $$1) {
         bwv var6 = $$0.a();
         bwv $$4 = this.q();
         bvk $$5 = this.dW().a((cso)this, $$4);
         var6.a($$1, $$5, 6.0F);
         dgp.a($$1, var6, $$5);
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

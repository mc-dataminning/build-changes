public class clx extends clt {
   private int e = 1;

   public clx(brn<? extends clx> $$0, dad $$1) {
      super($$0, $$1);
   }

   public clx(dad $$0, bsa $$1, double $$2, double $$3, double $$4, int $$5) {
      super(brn.aj, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(etn $$0) {
      super.a($$0);
      if (!this.dN().B) {
         boolean $$1 = this.dN().aa().b(czz.c);
         this.dN().a(this, this.ds(), this.du(), this.dy(), (float)this.e, $$1, dad.a.c);
         this.am();
      }
   }

   @Override
   protected void a(etm $$0) {
      super.a($$0);
      if (!this.dN().B) {
         brh $$1 = $$0.a();
         brh $$2 = this.u();
         $$1.a(this.dO().a((clt)this, $$2), 6.0F);
         if ($$2 instanceof bsa) {
            this.a((bsa)$$2, $$1);
         }
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
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

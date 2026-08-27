public class cfx extends cft {
   private int e = 1;

   public cfx(bly<? extends cfx> $$0, cto $$1) {
      super($$0, $$1);
   }

   public cfx(cto $$0, bmk $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bly.ah, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(elq $$0) {
      super.a($$0);
      if (!this.dM().B) {
         boolean $$1 = this.dM().Z().b(ctk.c);
         this.dM().a(this, this.dr(), this.dt(), this.dx(), (float)this.e, $$1, cto.a.c);
         this.am();
      }
   }

   @Override
   protected void a(elp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         blu $$1 = $$0.a();
         blu $$2 = this.w();
         $$1.a(this.dN().a((cft)this, $$2), 6.0F);
         if ($$2 instanceof bmk) {
            this.a((bmk)$$2, $$1);
         }
      }
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

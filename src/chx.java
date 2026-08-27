public class chx extends cht {
   private int e = 1;

   public chx(bnu<? extends chx> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public chx(cvn $$0, bog $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bnu.ai, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(enq $$0) {
      super.a($$0);
      if (!this.dM().B) {
         boolean $$1 = this.dM().Z().b(cvj.c);
         this.dM().a(this, this.dr(), this.dt(), this.dx(), (float)this.e, $$1, cvn.a.c);
         this.am();
      }
   }

   @Override
   protected void a(enp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         bno $$1 = $$0.a();
         bno $$2 = this.w();
         $$1.a(this.dN().a((cht)this, $$2), 6.0F);
         if ($$2 instanceof bog) {
            this.a((bog)$$2, $$1);
         }
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

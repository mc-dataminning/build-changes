public class cfr extends cfn {
   private int e = 1;

   public cfr(blt<? extends cfr> $$0, cti $$1) {
      super($$0, $$1);
   }

   public cfr(cti $$0, bmf $$1, double $$2, double $$3, double $$4, int $$5) {
      super(blt.ah, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(elk $$0) {
      super.a($$0);
      if (!this.dM().B) {
         boolean $$1 = this.dM().Z().b(cte.c);
         this.dM().a(this, this.dr(), this.dt(), this.dx(), (float)this.e, $$1, cti.a.c);
         this.am();
      }
   }

   @Override
   protected void a(elj $$0) {
      super.a($$0);
      if (!this.dM().B) {
         blp $$1 = $$0.a();
         blp $$2 = this.w();
         $$1.a(this.dN().a((cfn)this, $$2), 6.0F);
         if ($$2 instanceof bmf) {
            this.a((bmf)$$2, $$1);
         }
      }
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

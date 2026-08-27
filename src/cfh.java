public class cfh extends cfd {
   private int e = 1;

   public cfh(blj<? extends cfh> $$0, csy $$1) {
      super($$0, $$1);
   }

   public cfh(csy $$0, blv $$1, double $$2, double $$3, double $$4, int $$5) {
      super(blj.ah, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(ekz $$0) {
      super.a($$0);
      if (!this.dM().B) {
         boolean $$1 = this.dM().Y().b(csu.c);
         this.dM().a(this, this.dr(), this.dt(), this.dx(), (float)this.e, $$1, csy.a.c);
         this.am();
      }
   }

   @Override
   protected void a(eky $$0) {
      super.a($$0);
      if (!this.dM().B) {
         blf $$1 = $$0.a();
         blf $$2 = this.w();
         $$1.a(this.dN().a((cfd)this, $$2), 6.0F);
         if ($$2 instanceof blv) {
            this.a((blv)$$2, $$1);
         }
      }
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

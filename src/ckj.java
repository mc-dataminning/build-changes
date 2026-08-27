public class ckj extends ckf {
   private int e = 1;

   public ckj(bqb<? extends ckj> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public ckj(cyx $$0, bqo $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bqb.aj, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(ery $$0) {
      super.a($$0);
      if (!this.dM().B) {
         boolean $$1 = this.dM().aa().b(cyt.c);
         this.dM().a(this, this.dr(), this.dt(), this.dx(), (float)this.e, $$1, cyx.a.c);
         this.am();
      }
   }

   @Override
   protected void a(erx $$0) {
      super.a($$0);
      if (!this.dM().B) {
         bpv $$1 = $$0.a();
         bpv $$2 = this.u();
         $$1.a(this.dN().a((ckf)this, $$2), 6.0F);
         if ($$2 instanceof bqo) {
            this.a((bqo)$$2, $$1);
         }
      }
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

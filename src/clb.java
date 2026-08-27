public class clb extends ckx {
   private int e = 1;

   public clb(bqr<? extends clb> $$0, czu $$1) {
      super($$0, $$1);
   }

   public clb(czu $$0, bre $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bqr.aj, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(etd $$0) {
      super.a($$0);
      if (!this.dN().B) {
         boolean $$1 = this.dN().aa().b(czq.c);
         this.dN().a(this, this.ds(), this.du(), this.dy(), (float)this.e, $$1, czu.a.c);
         this.am();
      }
   }

   @Override
   protected void a(etc $$0) {
      super.a($$0);
      if (!this.dN().B) {
         bql $$1 = $$0.a();
         bql $$2 = this.u();
         $$1.a(this.dO().a((ckx)this, $$2), 6.0F);
         if ($$2 instanceof bre) {
            this.a((bre)$$2, $$1);
         }
      }
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

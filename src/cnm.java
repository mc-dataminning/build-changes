public class cnm extends cni {
   private int g = 1;

   public cnm(bsz<? extends cnm> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public cnm(dbx $$0, bto $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bsz.ak, $$1, $$2, $$3, $$4, $$0);
      this.g = $$5;
   }

   @Override
   protected void a(evo $$0) {
      super.a($$0);
      if (!this.dP().B) {
         boolean $$1 = this.dP().ab().b(dbt.c);
         this.dP().a(this, this.du(), this.dw(), this.dA(), (float)this.g, $$1, dbx.a.c);
         this.ao();
      }
   }

   @Override
   protected void a(evn $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bst $$1 = $$0.a();
         bst $$2 = this.s();
         $$1.a(this.dQ().a((cni)this, $$2), 6.0F);
         if ($$2 instanceof bto) {
            this.a((bto)$$2, $$1);
         }
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.g);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.g = $$0.f("ExplosionPower");
      }
   }
}

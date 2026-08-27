public class cep extends cel {
   private int e = 1;

   public cep(bkz<? extends cep> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cep(csf $$0, bll $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bkz.ag, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(ejx $$0) {
      super.a($$0);
      if (!this.dN().B) {
         boolean $$1 = this.dN().Y().b(csb.c);
         this.dN().a(this, this.ds(), this.du(), this.dy(), (float)this.e, $$1, csf.a.c);
         this.am();
      }
   }

   @Override
   protected void a(ejw $$0) {
      super.a($$0);
      if (!this.dN().B) {
         bkv $$1 = $$0.a();
         bkv $$2 = this.w();
         $$1.a(this.dO().a((cel)this, $$2), 6.0F);
         if ($$2 instanceof bll) {
            this.a((bll)$$2, $$1);
         }
      }
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

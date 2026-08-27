public class ccb extends cbx {
   private int e = 1;

   public ccb(bik<? extends ccb> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public ccb(cpk $$0, biw $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bik.ag, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(ehd $$0) {
      super.a($$0);
      if (!this.dK().B) {
         boolean $$1 = this.dK().X().b(cpg.c);
         this.dK().a(this, this.dp(), this.dr(), this.dv(), (float)this.e, $$1, cpk.a.c);
         this.ak();
      }
   }

   @Override
   protected void a(ehc $$0) {
      super.a($$0);
      if (!this.dK().B) {
         big $$1 = $$0.a();
         big $$2 = this.v();
         $$1.a(this.dL().a((cbx)this, $$2), 6.0F);
         if ($$2 instanceof biw) {
            this.a((biw)$$2, $$1);
         }
      }
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

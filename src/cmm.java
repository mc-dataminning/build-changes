public class cmm extends cmi {
   private int e = 1;

   public cmm(bsa<? extends cmm> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cmm(dax $$0, bso $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bsa.ak, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(eui $$0) {
      super.a($$0);
      if (!this.dP().B) {
         boolean $$1 = this.dP().aa().b(dat.c);
         this.dP().a(this, this.du(), this.dw(), this.dA(), (float)this.e, $$1, dax.a.c);
         this.ao();
      }
   }

   @Override
   protected void a(euh $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bru $$1 = $$0.a();
         bru $$2 = this.s();
         $$1.a(this.dQ().a((cmi)this, $$2), 6.0F);
         if ($$2 instanceof bso) {
            this.a((bso)$$2, $$1);
         }
      }
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

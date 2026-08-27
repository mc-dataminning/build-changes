public class cmp extends cml {
   private final boolean e;
   private int g = 1;

   public cmp(bsb<? extends cmp> $$0, dca $$1) {
      super($$0, $$1);
      this.e = true;
   }

   public cmp(dca $$0, bso $$1, double $$2, double $$3, double $$4, int $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, true);
   }

   public cmp(dca $$0, bso $$1, double $$2, double $$3, double $$4, int $$5, boolean $$6) {
      super(bsb.al, $$1, $$2, $$3, $$4, $$0);
      this.g = $$5;
      this.e = $$6;
   }

   @Override
   protected void a(ews $$0) {
      super.a($$0);
      if (!this.dU().C) {
         boolean $$1 = this.dU().ab().b(dbw.c);
         this.dU().a(this, this.dz(), this.dB(), this.dF(), (float)this.g, this.e && $$1, dca.a.c);
         this.ao();
      }
   }

   @Override
   protected void a(ewr $$0) {
      super.a($$0);
      if (!this.dU().C) {
         brv $$1 = $$0.a();
         brv $$2 = this.t();
         $$1.a(this.dX().a((cml)this, $$2), 6.0F);
         if ($$2 instanceof bso) {
            this.a((bso)$$2, $$1);
         }
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.g);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.g = $$0.f("ExplosionPower");
      }
   }
}

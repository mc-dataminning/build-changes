public class ciq extends cim {
   private int e = 1;

   public ciq(bol<? extends ciq> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public ciq(cwe $$0, box $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bol.ai, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(eot $$0) {
      super.a($$0);
      if (!this.dJ().B) {
         boolean $$1 = this.dJ().Z().b(cwa.c);
         this.dJ().a(this, this.do(), this.dq(), this.du(), (float)this.e, $$1, cwe.a.c);
         this.am();
      }
   }

   @Override
   protected void a(eos $$0) {
      super.a($$0);
      if (!this.dJ().B) {
         bof $$1 = $$0.a();
         bof $$2 = this.w();
         $$1.a(this.dK().a((cim)this, $$2), 6.0F);
         if ($$2 instanceof box) {
            this.a((box)$$2, $$1);
         }
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

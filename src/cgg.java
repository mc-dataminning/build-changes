public class cgg extends cgc {
   private int e = 1;

   public cgg(bmc<? extends cgg> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cgg(ctx $$0, bmo $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bmc.ai, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(ema $$0) {
      super.a($$0);
      if (!this.dL().B) {
         boolean $$1 = this.dL().Z().b(ctt.c);
         this.dL().a(this, this.dq(), this.ds(), this.dw(), (float)this.e, $$1, ctx.a.c);
         this.am();
      }
   }

   @Override
   protected void a(elz $$0) {
      super.a($$0);
      if (!this.dL().B) {
         blw $$1 = $$0.a();
         blw $$2 = this.w();
         $$1.a(this.dM().a((cgc)this, $$2), 6.0F);
         if ($$2 instanceof bmo) {
            this.a((bmo)$$2, $$1);
         }
      }
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

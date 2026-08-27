public class ccq extends ccm {
   private int e = 1;

   public ccq(bja<? extends ccq> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public ccq(cqb $$0, bjm $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bja.ag, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(ehf $$0) {
      super.a($$0);
      if (!this.dL().B) {
         boolean $$1 = this.dL().X().b(cpx.c);
         this.dL().a(this, this.dq(), this.ds(), this.dw(), (float)this.e, $$1, cqb.a.c);
         this.ak();
      }
   }

   @Override
   protected void a(ehe $$0) {
      super.a($$0);
      if (!this.dL().B) {
         biw $$1 = $$0.a();
         biw $$2 = this.v();
         $$1.a(this.dM().a((ccm)this, $$2), 6.0F);
         if ($$2 instanceof bjm) {
            this.a((bjm)$$2, $$1);
         }
      }
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

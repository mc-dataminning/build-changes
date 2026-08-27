public class cdn extends cdj {
   private int e = 1;

   public cdn(bjx<? extends cdn> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cdn(cqz $$0, bkj $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bjx.ag, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(eid $$0) {
      super.a($$0);
      if (!this.dL().B) {
         boolean $$1 = this.dL().X().b(cqv.c);
         this.dL().a(this, this.dq(), this.ds(), this.dw(), (float)this.e, $$1, cqz.a.c);
         this.ak();
      }
   }

   @Override
   protected void a(eic $$0) {
      super.a($$0);
      if (!this.dL().B) {
         bjt $$1 = $$0.a();
         bjt $$2 = this.v();
         $$1.a(this.dM().a((cdj)this, $$2), 6.0F);
         if ($$2 instanceof bkj) {
            this.a((bkj)$$2, $$1);
         }
      }
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

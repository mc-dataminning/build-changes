public class cck extends ccg {
   private int e = 1;

   public cck(biu<? extends cck> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public cck(cpv $$0, bjg $$1, double $$2, double $$3, double $$4, int $$5) {
      super(biu.ag, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(ehl $$0) {
      super.a($$0);
      if (!this.dL().B) {
         boolean $$1 = this.dL().X().b(cpr.c);
         this.dL().a(this, this.dq(), this.ds(), this.dw(), (float)this.e, $$1, cpv.a.c);
         this.ak();
      }
   }

   @Override
   protected void a(ehk $$0) {
      super.a($$0);
      if (!this.dL().B) {
         biq $$1 = $$0.a();
         biq $$2 = this.v();
         $$1.a(this.dM().a((ccg)this, $$2), 6.0F);
         if ($$2 instanceof bjg) {
            this.a((bjg)$$2, $$1);
         }
      }
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}

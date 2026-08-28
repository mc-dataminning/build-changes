public class cnw extends cne {
   private int f = 200;

   public cnw(btb<? extends cnw> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public cnw(dbz $$0, btq $$1, cuq $$2) {
      super(btb.aV, $$1, $$0, $$2);
   }

   public cnw(dbz $$0, double $$1, double $$2, double $$3, cuq $$4) {
      super(btb.aV, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B && !this.b) {
         this.dP().a(li.R, this.du(), this.dw(), this.dA(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(btq $$0) {
      super.a($$0);
      bsd $$1 = new bsd(bsf.x, this.f, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected cuq x() {
      return new cuq(cut.vp);
   }
}

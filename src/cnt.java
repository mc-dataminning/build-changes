public class cnt extends cnb {
   private int f = 200;

   public cnt(bsy<? extends cnt> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public cnt(dbw $$0, btn $$1, cun $$2) {
      super(bsy.aV, $$1, $$0, $$2);
   }

   public cnt(dbw $$0, double $$1, double $$2, double $$3, cun $$4) {
      super(bsy.aV, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B && !this.b) {
         this.dP().a(li.R, this.du(), this.dw(), this.dA(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(btn $$0) {
      super.a($$0);
      bsa $$1 = new bsa(bsc.x, this.f, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected cun x() {
      return new cun(cuq.vp);
   }
}

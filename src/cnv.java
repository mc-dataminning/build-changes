import javax.annotation.Nullable;

public class cnv extends cnd {
   private int f = 200;

   public cnv(bsx<? extends cnv> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cnv(dcw $$0, btn $$1, cuq $$2, @Nullable cuq $$3) {
      super(bsx.aV, $$1, $$0, $$2, $$3);
   }

   public cnv(dcw $$0, double $$1, double $$2, double $$3, cuq $$4, @Nullable cuq $$5) {
      super(bsx.aV, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void l() {
      super.l();
      if (this.dO().B && !this.b) {
         this.dO().a(lm.R, this.dt(), this.dv(), this.dz(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(btn $$0) {
      super.a($$0);
      brz $$1 = new brz(bsb.x, this.f, 0);
      $$0.b($$1, this.H());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected cuq x() {
      return new cuq(cut.vp);
   }
}

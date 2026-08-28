import javax.annotation.Nullable;

public class cox extends coe {
   private int f = 200;

   public cox(bty<? extends cox> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cox(dej $$0, bun $$1, cvs $$2, @Nullable cvs $$3) {
      super(bty.aV, $$1, $$0, $$2, $$3);
   }

   public cox(dej $$0, double $$1, double $$2, double $$3, cvs $$4, @Nullable cvs $$5) {
      super(bty.aV, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B && !this.b) {
         this.dS().a(lo.R, this.dx(), this.dz(), this.dD(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bun $$0) {
      super.a($$0);
      bsy $$1 = new bsy(bta.x, this.f, 0);
      $$0.b($$1, this.F());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected cvs v() {
      return new cvs(cvw.vr);
   }
}

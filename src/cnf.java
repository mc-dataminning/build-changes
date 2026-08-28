import javax.annotation.Nullable;

public class cnf extends cmn {
   private int f = 200;

   public cnf(bsj<? extends cnf> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cnf(dcd $$0, bsy $$1, cua $$2, @Nullable cua $$3) {
      super(bsj.aV, $$1, $$0, $$2, $$3);
   }

   public cnf(dcd $$0, double $$1, double $$2, double $$3, cua $$4, @Nullable cua $$5) {
      super(bsj.aV, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B && !this.b) {
         this.dP().a(lj.R, this.du(), this.dw(), this.dA(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bsy $$0) {
      super.a($$0);
      brl $$1 = new brl(brn.x, this.f, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected cua y() {
      return new cua(cud.vp);
   }
}

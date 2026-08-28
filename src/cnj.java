import javax.annotation.Nullable;

public class cnj extends cmr {
   private int f = 200;

   public cnj(bsn<? extends cnj> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cnj(dcg $$0, btc $$1, cud $$2, @Nullable cud $$3) {
      super(bsn.aV, $$1, $$0, $$2, $$3);
   }

   public cnj(dcg $$0, double $$1, double $$2, double $$3, cud $$4, @Nullable cud $$5) {
      super(bsn.aV, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void l() {
      super.l();
      if (this.dR().B && !this.b) {
         this.dR().a(lj.R, this.dw(), this.dy(), this.dC(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(btc $$0) {
      super.a($$0);
      brp $$1 = new brp(brr.x, this.f, 0);
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
   protected cud y() {
      return new cud(cug.vp);
   }
}

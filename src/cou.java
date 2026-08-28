import javax.annotation.Nullable;

public class cou extends cob {
   private int f = 200;

   public cou(btv<? extends cou> $$0, deg $$1) {
      super($$0, $$1);
   }

   public cou(deg $$0, buk $$1, cvp $$2, @Nullable cvp $$3) {
      super(btv.aV, $$1, $$0, $$2, $$3);
   }

   public cou(deg $$0, double $$1, double $$2, double $$3, cvp $$4, @Nullable cvp $$5) {
      super(btv.aV, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B && !this.b) {
         this.dS().a(ln.R, this.dx(), this.dz(), this.dD(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(buk $$0) {
      super.a($$0);
      bsv $$1 = new bsv(bsx.x, this.f, 0);
      $$0.b($$1, this.F());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected cvp v() {
      return new cvp(cvt.vr);
   }
}

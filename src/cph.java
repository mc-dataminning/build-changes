import javax.annotation.Nullable;

public class cph extends cop {
   private int f = 200;

   public cph(bug<? extends cph> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cph(dev $$0, buv $$1, cvx $$2, @Nullable cvx $$3) {
      super(bug.aV, $$1, $$0, $$2, $$3);
   }

   public cph(dev $$0, double $$1, double $$2, double $$3, cvx $$4, @Nullable cvx $$5) {
      super(bug.aV, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void l() {
      super.l();
      if (this.dX().C && !this.b) {
         this.dX().a(lq.R, this.dC(), this.dE(), this.dI(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(buv $$0) {
      super.a($$0);
      bte $$1 = new bte(btg.x, this.f, 0);
      $$0.b($$1, this.F());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected cvx v() {
      return new cvx(cwb.vr);
   }
}

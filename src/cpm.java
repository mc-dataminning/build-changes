import javax.annotation.Nullable;

public class cpm extends cou {
   private int f = 200;

   public cpm(bul<? extends cpm> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cpm(dfb $$0, bva $$1, cwb $$2, @Nullable cwb $$3) {
      super(bul.aV, $$1, $$0, $$2, $$3);
   }

   public cpm(dfb $$0, double $$1, double $$2, double $$3, cwb $$4, @Nullable cwb $$5) {
      super(bul.aV, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void l() {
      super.l();
      if (this.dX().C && !this.b) {
         this.dX().a(lr.R, this.dC(), this.dE(), this.dI(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bva $$0) {
      super.a($$0);
      btj $$1 = new btj(btl.x, this.f, 0);
      $$0.b($$1, this.E());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected cwb v() {
      return new cwb(cwf.vr);
   }
}

import javax.annotation.Nullable;

public class cpt extends cpb {
   private int e = 200;

   public cpt(bus<? extends cpt> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public cpt(dfm $$0, bvh $$1, cwm $$2, @Nullable cwm $$3) {
      super(bus.bj, $$1, $$0, $$2, $$3);
   }

   public cpt(dfm $$0, double $$1, double $$2, double $$3, cwm $$4, @Nullable cwm $$5) {
      super(bus.bj, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && !this.a) {
         this.dV().a(ls.R, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bvh $$0) {
      super.a($$0);
      btq $$1 = new btq(bts.x, this.e, 0);
      $$0.b($$1, this.B());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.e = $$0.h("Duration");
      }
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("Duration", this.e);
   }

   @Override
   protected cwm s() {
      return new cwm(cwq.vH);
   }
}

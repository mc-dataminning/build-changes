import javax.annotation.Nullable;

public class cqr extends cpz {
   private int e = 200;

   public cqr(bvm<? extends cqr> $$0, dha $$1) {
      super($$0, $$1);
   }

   public cqr(dha $$0, bwb $$1, cxk $$2, @Nullable cxk $$3) {
      super(bvm.bn, $$1, $$0, $$2, $$3);
   }

   public cqr(dha $$0, double $$1, double $$2, double $$3, cxk $$4, @Nullable cxk $$5) {
      super(bvm.bn, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && !this.a) {
         this.dV().a(ls.R, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bwb $$0) {
      super.a($$0);
      buk $$1 = new buk(bum.x, this.e, 0);
      $$0.b($$1, this.D());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.e = $$0.h("Duration");
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Duration", this.e);
   }

   @Override
   protected cxk u() {
      return new cxk(cxo.wf);
   }
}

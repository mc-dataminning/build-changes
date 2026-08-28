import javax.annotation.Nullable;

public class cqw extends cqe {
   private int e = 200;

   public cqw(bvr<? extends cqw> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public cqw(dhi $$0, bwg $$1, cxp $$2, @Nullable cxp $$3) {
      super(bvr.bn, $$1, $$0, $$2, $$3);
   }

   public cqw(dhi $$0, double $$1, double $$2, double $$3, cxp $$4, @Nullable cxp $$5) {
      super(bvr.bn, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C && !this.l()) {
         this.dW().a(ls.R, this.dB(), this.dD(), this.dH(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bwg $$0) {
      super.a($$0);
      bup $$1 = new bup(bur.x, this.e, 0);
      $$0.b($$1, this.E());
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
   protected cxp v() {
      return new cxp(cxt.wf);
   }
}

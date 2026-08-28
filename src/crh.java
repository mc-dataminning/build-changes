import javax.annotation.Nullable;

public class crh extends cqp {
   private int d = 200;

   public crh(bwb<? extends crh> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public crh(dhp $$0, bwr $$1, cxy $$2, @Nullable cxy $$3) {
      super(bwb.bm, $$1, $$0, $$2, $$3);
   }

   public crh(dhp $$0, double $$1, double $$2, double $$3, cxy $$4, @Nullable cxy $$5) {
      super(bwb.bm, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && !this.f()) {
         this.dV().a(lv.T, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bwr $$0) {
      super.a($$0);
      buw $$1 = new buw(buy.x, this.d, 0);
      $$0.b($$1, this.z());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.d = $$0.h("Duration");
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Duration", this.d);
   }

   @Override
   protected cxy o() {
      return new cxy(cyc.wt);
   }
}

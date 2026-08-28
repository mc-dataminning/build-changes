import javax.annotation.Nullable;

public class cqq extends cpy {
   private int d = 200;

   public cqq(bvi<? extends cqq> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqq(dgz $$0, bvy $$1, cxh $$2, @Nullable cxh $$3) {
      super(bvi.bm, $$1, $$0, $$2, $$3);
   }

   public cqq(dgz $$0, double $$1, double $$2, double $$3, cxh $$4, @Nullable cxh $$5) {
      super(bvi.bm, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dU().C && !this.f()) {
         this.dU().a(lt.T, this.dz(), this.dB(), this.dF(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bvy $$0) {
      super.a($$0);
      bue $$1 = new bue(bug.x, this.d, 0);
      $$0.b($$1, this.z());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.d = $$0.h("Duration");
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Duration", this.d);
   }

   @Override
   protected cxh o() {
      return new cxh(cxl.wr);
   }
}

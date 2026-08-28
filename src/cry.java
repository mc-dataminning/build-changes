import javax.annotation.Nullable;

public class cry extends crf {
   private int d = 200;

   public cry(bwm<? extends cry> $$0, div $$1) {
      super($$0, $$1);
   }

   public cry(div $$0, bxc $$1, cyy $$2, @Nullable cyy $$3) {
      super(bwm.bn, $$1, $$0, $$2, $$3);
   }

   public cry(div $$0, double $$1, double $$2, double $$3, cyy $$4, @Nullable cyy $$5) {
      super(bwm.bn, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && !this.f()) {
         this.dV().a(lx.T, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bxc $$0) {
      super.a($$0);
      bvh $$1 = new bvh(bvj.x, this.d, 0);
      $$0.b($$1, this.z());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.d = $$0.h("Duration");
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Duration", this.d);
   }

   @Override
   protected cyy o() {
      return new cyy(czc.wv);
   }
}

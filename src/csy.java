import javax.annotation.Nullable;

public class csy extends csf {
   private static final int d = 200;
   private int e = 200;

   public csy(bxc<? extends csy> $$0, djx $$1) {
      super($$0, $$1);
   }

   public csy(djx $$0, bxu $$1, czy $$2, @Nullable czy $$3) {
      super(bxc.bo, $$1, $$0, $$2, $$3);
   }

   public csy(djx $$0, double $$1, double $$2, double $$3, czy $$4, @Nullable czy $$5) {
      super(bxc.bo, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && !this.f()) {
         this.dV().a(ly.T, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bxu $$0) {
      super.a($$0);
      bvx $$1 = new bvx(bvz.x, this.e, 0);
      $$0.b($$1, this.z());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.e = $$0.b("Duration", 200);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Duration", this.e);
   }

   @Override
   protected czy o() {
      return new czy(dac.wA);
   }
}

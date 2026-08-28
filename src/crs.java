import javax.annotation.Nullable;

public class crs extends cqz {
   private int d = 200;

   public crs(bwj<? extends crs> $$0, dip $$1) {
      super($$0, $$1);
   }

   public crs(dip $$0, bwz $$1, cys $$2, @Nullable cys $$3) {
      super(bwj.bn, $$1, $$0, $$2, $$3);
   }

   public crs(dip $$0, double $$1, double $$2, double $$3, cys $$4, @Nullable cys $$5) {
      super(bwj.bn, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && !this.f()) {
         this.dV().a(lx.T, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bwz $$0) {
      super.a($$0);
      bve $$1 = new bve(bvg.x, this.d, 0);
      $$0.b($$1, this.z());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.d = $$0.h("Duration");
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Duration", this.d);
   }

   @Override
   protected cys o() {
      return new cys(cyw.wt);
   }
}

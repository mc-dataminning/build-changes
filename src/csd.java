import javax.annotation.Nullable;

public class csd extends crk {
   private int d = 200;

   public csd(bwo<? extends csd> $$0, dja $$1) {
      super($$0, $$1);
   }

   public csd(dja $$0, bxe $$1, czd $$2, @Nullable czd $$3) {
      super(bwo.bn, $$1, $$0, $$2, $$3);
   }

   public csd(dja $$0, double $$1, double $$2, double $$3, czd $$4, @Nullable czd $$5) {
      super(bwo.bn, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && !this.f()) {
         this.dV().a(lx.T, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bxe $$0) {
      super.a($$0);
      bvj $$1 = new bvj(bvl.x, this.d, 0);
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
   protected czd o() {
      return new czd(czh.wA);
   }
}

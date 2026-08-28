import javax.annotation.Nullable;

public class ctj extends csq {
   private static final int d = 200;
   private int e = 200;

   public ctj(bxn<? extends ctj> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public ctj(dkj $$0, byf $$1, dak $$2, @Nullable dak $$3) {
      super(bxn.bo, $$1, $$0, $$2, $$3);
   }

   public ctj(dkj $$0, double $$1, double $$2, double $$3, dak $$4, @Nullable dak $$5) {
      super(bxn.bo, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && !this.f()) {
         this.dV().a(lz.T, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(byf $$0) {
      super.a($$0);
      bwi $$1 = new bwi(bwk.x, this.e, 0);
      $$0.b($$1, this.z());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.e = $$0.b("Duration", 200);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Duration", this.e);
   }

   @Override
   protected dak o() {
      return new dak(dao.wA);
   }
}

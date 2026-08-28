import javax.annotation.Nullable;

public class cta extends csh {
   private static final int d = 200;
   private int e = 200;

   public cta(bxe<? extends cta> $$0, djz $$1) {
      super($$0, $$1);
   }

   public cta(djz $$0, bxw $$1, daa $$2, @Nullable daa $$3) {
      super(bxe.bo, $$1, $$0, $$2, $$3);
   }

   public cta(djz $$0, double $$1, double $$2, double $$3, daa $$4, @Nullable daa $$5) {
      super(bxe.bo, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && !this.f()) {
         this.dV().a(lz.T, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bxw $$0) {
      super.a($$0);
      bvz $$1 = new bvz(bwb.x, this.e, 0);
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
   protected daa o() {
      return new daa(dae.wA);
   }
}

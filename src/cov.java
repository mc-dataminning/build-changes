public abstract class cov extends coq implements coy {
   private static final float e = 12.25F;
   private static final akk<cvx> f = ako.a(cov.class, akm.h);

   public cov(bug<? extends cov> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cov(bug<? extends cov> $$0, double $$1, double $$2, double $$3, ezh $$4, dev $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cov(bug<? extends cov> $$0, buv $$1, ezh $$2, dev $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cvx $$0) {
      if ($$0.f()) {
         this.av().a(f, this.w());
      } else {
         this.av().a(f, $$0.c(1));
      }
   }

   @Override
   public cvx m() {
      return this.av().a(f);
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(f, this.w());
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Item", this.m().a(this.dZ()));
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cvx.a(this.dZ(), (vg)$$0.p("Item")).orElse(this.w()));
      } else {
         this.a(this.w());
      }
   }

   private cvx w() {
      return new cvx(cwb.tY);
   }

   @Override
   public bvn a_(int $$0) {
      return $$0 == 0 ? bvn.a(this::m, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return this.ag < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}

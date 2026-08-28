public abstract class coh extends coc implements cok {
   private static final float e = 12.25F;
   private static final akg<cvp> f = akk.a(coh.class, aki.h);

   public coh(btv<? extends coh> $$0, deg $$1) {
      super($$0, $$1);
   }

   public coh(btv<? extends coh> $$0, double $$1, double $$2, double $$3, eys $$4, deg $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public coh(btv<? extends coh> $$0, buk $$1, eys $$2, deg $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cvp $$0) {
      if ($$0.f()) {
         this.at().a(f, this.w());
      } else {
         this.at().a(f, $$0.c(1));
      }
   }

   @Override
   public cvp m() {
      return this.at().a(f);
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(f, this.w());
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Item", this.m().a(this.dU()));
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cvp.a(this.dU(), (vc)$$0.p("Item")).orElse(this.w()));
      } else {
         this.a(this.w());
      }
   }

   private cvp w() {
      return new cvp(cvt.tY);
   }

   @Override
   public bvb a_(int $$0) {
      return $$0 == 0 ? bvb.a(this::m, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return this.ag < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}

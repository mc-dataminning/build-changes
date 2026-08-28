public abstract class cov extends cow implements cok {
   private static final akg<cvp> b = akk.a(cov.class, aki.h);

   public cov(btv<? extends cov> $$0, deg $$1) {
      super($$0, $$1);
   }

   public cov(btv<? extends cov> $$0, double $$1, double $$2, double $$3, deg $$4, cvp $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cov(btv<? extends cov> $$0, buk $$1, deg $$2, cvp $$3) {
      this($$0, $$1.dx(), $$1.dB() - 0.1F, $$1.dD(), $$2, $$3);
      this.c($$1);
   }

   public void a(cvp $$0) {
      this.at().a(b, $$0.c(1));
   }

   protected abstract cvk o();

   @Override
   public cvp m() {
      return this.at().a(b);
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(b, new cvp(this.o()));
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
         this.a(cvp.a(this.dU(), (vc)$$0.p("Item")).orElseGet(() -> new cvp(this.o())));
      } else {
         this.a(new cvp(this.o()));
      }
   }
}

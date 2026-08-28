public abstract class cqs extends cqt implements cqi {
   private static final alc<cxk> a = alg.a(cqs.class, ale.h);

   public cqs(bvm<? extends cqs> $$0, dha $$1) {
      super($$0, $$1);
   }

   public cqs(bvm<? extends cqs> $$0, double $$1, double $$2, double $$3, dha $$4, cxk $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cqs(bvm<? extends cqs> $$0, bwb $$1, dha $$2, cxk $$3) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3);
      this.c($$1);
   }

   public void a(cxk $$0) {
      this.au().a(a, $$0.c(1));
   }

   protected abstract cxg m();

   @Override
   public cxk l() {
      return this.au().a(a);
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(a, new cxk(this.m()));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Item", this.l().a(this.dX()));
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cxk.a(this.dX(), (vu)$$0.p("Item")).orElseGet(() -> new cxk(this.m())));
      } else {
         this.a(new cxk(this.m()));
      }
   }
}

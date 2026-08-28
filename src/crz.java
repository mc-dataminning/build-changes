public abstract class crz extends csa implements crp {
   private static final akj<cyy> a = akn.a(crz.class, akl.h);

   public crz(bwm<? extends crz> $$0, div $$1) {
      super($$0, $$1);
   }

   public crz(bwm<? extends crz> $$0, double $$1, double $$2, double $$3, div $$4, cyy $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public crz(bwm<? extends crz> $$0, bxc $$1, div $$2, cyy $$3) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3);
      this.c($$1);
   }

   public void a(cyy $$0) {
      this.au().a(a, $$0.c(1));
   }

   protected abstract cyu g();

   @Override
   public cyy f() {
      return this.au().a(a);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(a, new cyy(this.g()));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Item", this.f().a(this.dX()));
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cyy.a(this.dX(), (uw)$$0.p("Item")).orElseGet(() -> new cyy(this.g())));
      } else {
         this.a(new cyy(this.g()));
      }
   }
}

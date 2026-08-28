public abstract class cpx extends cpy implements cpn {
   private static final ajy<cwp> a = akc.a(cpx.class, aka.h);

   public cpx(bus<? extends cpx> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cpx(bus<? extends cpx> $$0, double $$1, double $$2, double $$3, dgi $$4, cwp $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cpx(bus<? extends cpx> $$0, bvh $$1, dgi $$2, cwp $$3) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3);
      this.c($$1);
   }

   public void a(cwp $$0) {
      this.au().a(a, $$0.c(1));
   }

   protected abstract cwl m();

   @Override
   public cwp l() {
      return this.au().a(a);
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(a, new cwp(this.m()));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Item", this.l().a(this.dX()));
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cwp.a(this.dX(), (un)$$0.p("Item")).orElseGet(() -> new cwp(this.m())));
      } else {
         this.a(new cwp(this.m()));
      }
   }
}

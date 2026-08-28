public abstract class cpx extends cpy implements cpn {
   private static final ajx<cwp> a = akb.a(cpx.class, ajz.h);

   public cpx(bur<? extends cpx> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cpx(bur<? extends cpx> $$0, double $$1, double $$2, double $$3, dgi $$4, cwp $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cpx(bur<? extends cpx> $$0, bvg $$1, dgi $$2, cwp $$3) {
      this($$0, $$1.dB(), $$1.dF() - 0.1F, $$1.dH(), $$2, $$3);
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
   protected void a(akb.a $$0) {
      $$0.a(a, new cwp(this.m()));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Item", this.l().a(this.dY()));
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cwp.a(this.dY(), (un)$$0.p("Item")).orElseGet(() -> new cwp(this.m())));
      } else {
         this.a(new cwp(this.m()));
      }
   }
}

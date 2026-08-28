public abstract class cpw extends cpx implements cpm {
   private static final ajy<cwo> a = akc.a(cpw.class, aka.h);

   public cpw(bur<? extends cpw> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public cpw(bur<? extends cpw> $$0, double $$1, double $$2, double $$3, dgh $$4, cwo $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cpw(bur<? extends cpw> $$0, bvg $$1, dgh $$2, cwo $$3) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3);
      this.c($$1);
   }

   public void a(cwo $$0) {
      this.au().a(a, $$0.c(1));
   }

   protected abstract cwk m();

   @Override
   public cwo l() {
      return this.au().a(a);
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(a, new cwo(this.m()));
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
         this.a(cwo.a(this.dX(), (un)$$0.p("Item")).orElseGet(() -> new cwo(this.m())));
      } else {
         this.a(new cwo(this.m()));
      }
   }
}

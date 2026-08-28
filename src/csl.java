public abstract class csl extends csm implements csb {
   private static final akj<czk> a = akn.a(csl.class, akl.h);

   public csl(bwr<? extends csl> $$0, djh $$1) {
      super($$0, $$1);
   }

   public csl(bwr<? extends csl> $$0, double $$1, double $$2, double $$3, djh $$4, czk $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public csl(bwr<? extends csl> $$0, bxj $$1, djh $$2, czk $$3) {
      this($$0, $$1.dz(), $$1.dD() - 0.1F, $$1.dF(), $$2, $$3);
      this.c($$1);
   }

   public void a(czk $$0) {
      this.ar().a(a, $$0.c(1));
   }

   protected abstract czg g();

   @Override
   public czk f() {
      return this.ar().a(a);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(a, new czk(this.g()));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      ale<uw> $$1 = this.dW().a(un.a);
      $$0.a("Item", czk.b, $$1, this.f());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ale<uw> $$1 = this.dW().a(un.a);
      this.a($$0.<czk>a("Item", czk.b, $$1).orElseGet(() -> new czk(this.g())));
   }
}

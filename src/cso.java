public abstract class cso extends csp implements cse {
   private static final akj<czn> a = akn.a(cso.class, akl.h);

   public cso(bwr<? extends cso> $$0, djm $$1) {
      super($$0, $$1);
   }

   public cso(bwr<? extends cso> $$0, double $$1, double $$2, double $$3, djm $$4, czn $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cso(bwr<? extends cso> $$0, bxj $$1, djm $$2, czn $$3) {
      this($$0, $$1.dz(), $$1.dD() - 0.1F, $$1.dF(), $$2, $$3);
      this.c($$1);
   }

   public void a(czn $$0) {
      this.ar().a(a, $$0.c(1));
   }

   protected abstract czj g();

   @Override
   public czn f() {
      return this.ar().a(a);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(a, new czn(this.g()));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      ale<uw> $$1 = this.dW().a(un.a);
      $$0.a("Item", czn.b, $$1, this.f());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ale<uw> $$1 = this.dW().a(un.a);
      this.a($$0.<czn>a("Item", czn.b, $$1).orElseGet(() -> new czn(this.g())));
   }
}

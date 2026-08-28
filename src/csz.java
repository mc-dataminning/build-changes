public abstract class csz extends cta implements csp {
   private static final akl<czy> a = akp.a(csz.class, akn.h);

   public csz(bxc<? extends csz> $$0, djx $$1) {
      super($$0, $$1);
   }

   public csz(bxc<? extends csz> $$0, double $$1, double $$2, double $$3, djx $$4, czy $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public csz(bxc<? extends csz> $$0, bxu $$1, djx $$2, czy $$3) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3);
      this.c($$1);
   }

   public void a(czy $$0) {
      this.ar().a(a, $$0.c(1));
   }

   protected abstract czu g();

   @Override
   public czy f() {
      return this.ar().a(a);
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(a, new czy(this.g()));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      alg<uy> $$1 = this.dX().a(un.a);
      $$0.a("Item", czy.b, $$1, this.f());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      alg<uy> $$1 = this.dX().a(un.a);
      this.a($$0.<czy>a("Item", czy.b, $$1).orElseGet(() -> new czy(this.g())));
   }
}

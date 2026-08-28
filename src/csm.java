public abstract class csm extends csg implements csp {
   private static final float d = 12.25F;
   private static final akl<czy> e = akp.a(csm.class, akn.h);

   public csm(bxc<? extends csm> $$0, djx $$1) {
      super($$0, $$1);
   }

   public csm(bxc<? extends csm> $$0, double $$1, double $$2, double $$3, ffq $$4, djx $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public csm(bxc<? extends csm> $$0, bxu $$1, ffq $$2, djx $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(czy $$0) {
      if ($$0.f()) {
         this.ar().a(e, this.o());
      } else {
         this.ar().a(e, $$0.c(1));
      }
   }

   @Override
   protected void aL() {
   }

   @Override
   public czy f() {
      return this.ar().a(e);
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(e, this.o());
   }

   @Override
   public void b(tz $$0) {
      alg<uy> $$1 = this.dX().a(un.a);
      $$0.a("Item", czy.b, $$1, this.f());
   }

   @Override
   public void a(tz $$0) {
      alg<uy> $$1 = this.dX().a(un.a);
      this.a($$0.<czy>a("Item", czy.b, $$1).orElse(this.o()));
   }

   private czy o() {
      return new czy(dac.vg);
   }

   @Override
   public byl a_(int $$0) {
      return $$0 == 0 ? byl.a(this::f, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}

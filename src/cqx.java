public abstract class cqx extends cqy implements cqn {
   private static final alc<cxp> a = alg.a(cqx.class, ale.h);

   public cqx(bvr<? extends cqx> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public cqx(bvr<? extends cqx> $$0, double $$1, double $$2, double $$3, dhi $$4, cxp $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cqx(bvr<? extends cqx> $$0, bwg $$1, dhi $$2, cxp $$3) {
      this($$0, $$1.dB(), $$1.dF() - 0.1F, $$1.dH(), $$2, $$3);
      this.c($$1);
   }

   public void a(cxp $$0) {
      this.au().a(a, $$0.c(1));
   }

   protected abstract cxl m();

   @Override
   public cxp l() {
      return this.au().a(a);
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(a, new cxp(this.m()));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Item", this.l().a(this.dY()));
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cxp.a(this.dY(), (vu)$$0.p("Item")).orElseGet(() -> new cxp(this.m())));
      } else {
         this.a(new cxp(this.m()));
      }
   }
}

public abstract class cqo extends cqp implements cqe {
   private static final aks<cxg> a = akw.a(cqo.class, aku.h);

   public cqo(bvi<? extends cqo> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqo(bvi<? extends cqo> $$0, double $$1, double $$2, double $$3, dgz $$4, cxg $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cqo(bvi<? extends cqo> $$0, bvx $$1, dgz $$2, cxg $$3) {
      this($$0, $$1.dB(), $$1.dF() - 0.1F, $$1.dH(), $$2, $$3);
      this.c($$1);
   }

   public void a(cxg $$0) {
      this.au().a(a, $$0.c(1));
   }

   protected abstract cxc m();

   @Override
   public cxg l() {
      return this.au().a(a);
   }

   @Override
   protected void a(akw.a $$0) {
      $$0.a(a, new cxg(this.m()));
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("Item", this.l().a(this.dY()));
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cxg.a(this.dY(), (vj)$$0.p("Item")).orElseGet(() -> new cxg(this.m())));
      } else {
         this.a(new cxg(this.m()));
      }
   }
}

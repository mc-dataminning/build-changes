public abstract class cqw extends cqx implements cqm {
   private static final alc<cxo> a = alg.a(cqw.class, ale.h);

   public cqw(bvq<? extends cqw> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public cqw(bvq<? extends cqw> $$0, double $$1, double $$2, double $$3, dhh $$4, cxo $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cqw(bvq<? extends cqw> $$0, bwf $$1, dhh $$2, cxo $$3) {
      this($$0, $$1.dB(), $$1.dF() - 0.1F, $$1.dH(), $$2, $$3);
      this.c($$1);
   }

   public void a(cxo $$0) {
      this.au().a(a, $$0.c(1));
   }

   protected abstract cxk m();

   @Override
   public cxo l() {
      return this.au().a(a);
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(a, new cxo(this.m()));
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
         this.a(cxo.a(this.dY(), (vu)$$0.p("Item")).orElseGet(() -> new cxo(this.m())));
      } else {
         this.a(new cxo(this.m()));
      }
   }
}

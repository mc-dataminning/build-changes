public abstract class cqr extends cqs implements cqh {
   private static final ajx<cxh> a = akb.a(cqr.class, ajz.h);

   public cqr(bvi<? extends cqr> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqr(bvi<? extends cqr> $$0, double $$1, double $$2, double $$3, dgz $$4, cxh $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cqr(bvi<? extends cqr> $$0, bvy $$1, dgz $$2, cxh $$3) {
      this($$0, $$1.dz(), $$1.dD() - 0.1F, $$1.dF(), $$2, $$3);
      this.c($$1);
   }

   public void a(cxh $$0) {
      this.au().a(a, $$0.c(1));
   }

   protected abstract cxd g();

   @Override
   public cxh f() {
      return this.au().a(a);
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(a, new cxh(this.g()));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Item", this.f().a(this.dW()));
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cxh.a(this.dW(), (un)$$0.p("Item")).orElseGet(() -> new cxh(this.g())));
      } else {
         this.a(new cxh(this.g()));
      }
   }
}

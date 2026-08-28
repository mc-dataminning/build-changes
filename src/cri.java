public abstract class cri extends crj implements cqy {
   private static final akg<cxy> a = akk.a(cri.class, aki.h);

   public cri(bwb<? extends cri> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public cri(bwb<? extends cri> $$0, double $$1, double $$2, double $$3, dhp $$4, cxy $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cri(bwb<? extends cri> $$0, bwr $$1, dhp $$2, cxy $$3) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3);
      this.c($$1);
   }

   public void a(cxy $$0) {
      this.au().a(a, $$0.c(1));
   }

   protected abstract cxu g();

   @Override
   public cxy f() {
      return this.au().a(a);
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(a, new cxy(this.g()));
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Item", this.f().a(this.dX()));
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cxy.a(this.dX(), (ut)$$0.p("Item")).orElseGet(() -> new cxy(this.g())));
      } else {
         this.a(new cxy(this.g()));
      }
   }
}

public abstract class cpy extends cpz implements cpo {
   private static final ajy<cwq> a = akc.a(cpy.class, aka.h);

   public cpy(but<? extends cpy> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public cpy(but<? extends cpy> $$0, double $$1, double $$2, double $$3, dgj $$4, cwq $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cpy(but<? extends cpy> $$0, bvi $$1, dgj $$2, cwq $$3) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3);
      this.c($$1);
   }

   public void a(cwq $$0) {
      this.au().a(a, $$0.c(1));
   }

   protected abstract cwm m();

   @Override
   public cwq l() {
      return this.au().a(a);
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(a, new cwq(this.m()));
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
         this.a(cwq.a(this.dX(), (un)$$0.p("Item")).orElseGet(() -> new cwq(this.m())));
      } else {
         this.a(new cwq(this.m()));
      }
   }
}

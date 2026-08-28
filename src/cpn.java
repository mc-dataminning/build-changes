public abstract class cpn extends cpo implements cpd {
   private static final akl<cwb> b = akp.a(cpn.class, akn.h);

   public cpn(bul<? extends cpn> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cpn(bul<? extends cpn> $$0, double $$1, double $$2, double $$3, dfb $$4, cwb $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cpn(bul<? extends cpn> $$0, bva $$1, dfb $$2, cwb $$3) {
      this($$0, $$1.dC(), $$1.dG() - 0.1F, $$1.dI(), $$2, $$3);
      this.c($$1);
   }

   public void a(cwb $$0) {
      this.aw().a(b, $$0.c(1));
   }

   protected abstract cvx o();

   @Override
   public cwb m() {
      return this.aw().a(b);
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(b, new cwb(this.o()));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Item", this.m().a(this.dZ()));
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cwb.a(this.dZ(), (vh)$$0.p("Item")).orElseGet(() -> new cwb(this.o())));
      } else {
         this.a(new cwb(this.o()));
      }
   }
}

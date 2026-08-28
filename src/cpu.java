public abstract class cpu extends cpv implements cpk {
   private static final akm<cwm> a = akq.a(cpu.class, ako.h);

   public cpu(bus<? extends cpu> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public cpu(bus<? extends cpu> $$0, double $$1, double $$2, double $$3, dfm $$4, cwm $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cpu(bus<? extends cpu> $$0, bvh $$1, dfm $$2, cwm $$3) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3);
      this.c($$1);
   }

   public void a(cwm $$0) {
      this.au().a(a, $$0.c(1));
   }

   protected abstract cwi l();

   @Override
   public cwm j() {
      return this.au().a(a);
   }

   @Override
   protected void a(akq.a $$0) {
      $$0.a(a, new cwm(this.l()));
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("Item", this.j().a(this.dX()));
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cwm.a(this.dX(), (vi)$$0.p("Item")).orElseGet(() -> new cwm(this.l())));
      } else {
         this.a(new cwm(this.l()));
      }
   }
}

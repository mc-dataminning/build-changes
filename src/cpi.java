public abstract class cpi extends cpj implements coy {
   private static final akk<cvx> b = ako.a(cpi.class, akm.h);

   public cpi(bug<? extends cpi> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cpi(bug<? extends cpi> $$0, double $$1, double $$2, double $$3, dev $$4, cvx $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cpi(bug<? extends cpi> $$0, buv $$1, dev $$2, cvx $$3) {
      this($$0, $$1.dC(), $$1.dG() - 0.1F, $$1.dI(), $$2, $$3);
      this.c($$1);
   }

   public void a(cvx $$0) {
      this.av().a(b, $$0.c(1));
   }

   protected abstract cvt o();

   @Override
   public cvx m() {
      return this.av().a(b);
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(b, new cvx(this.o()));
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Item", this.m().a(this.dZ()));
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cvx.a(this.dZ(), (vg)$$0.p("Item")).orElseGet(() -> new cvx(this.o())));
      } else {
         this.a(new cvx(this.o()));
      }
   }
}

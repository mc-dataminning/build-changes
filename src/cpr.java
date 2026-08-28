public abstract class cpr extends cps implements cph {
   private static final ako<cwf> b = aks.a(cpr.class, akq.h);

   public cpr(bup<? extends cpr> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpr(bup<? extends cpr> $$0, double $$1, double $$2, double $$3, dff $$4, cwf $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cpr(bup<? extends cpr> $$0, bve $$1, dff $$2, cwf $$3) {
      this($$0, $$1.dD(), $$1.dH() - 0.1F, $$1.dJ(), $$2, $$3);
      this.c($$1);
   }

   public void a(cwf $$0) {
      this.aw().a(b, $$0.c(1));
   }

   protected abstract cwb o();

   @Override
   public cwf m() {
      return this.aw().a(b);
   }

   @Override
   protected void a(aks.a $$0) {
      $$0.a(b, new cwf(this.o()));
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Item", this.m().a(this.ea()));
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cwf.a(this.ea(), (vk)$$0.p("Item")).orElseGet(() -> new cwf(this.o())));
      } else {
         this.a(new cwf(this.o()));
      }
   }
}

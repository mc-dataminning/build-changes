public abstract class cse extends csf implements cru {
   private static final akj<czd> a = akn.a(cse.class, akl.h);

   public cse(bwo<? extends cse> $$0, dja $$1) {
      super($$0, $$1);
   }

   public cse(bwo<? extends cse> $$0, double $$1, double $$2, double $$3, dja $$4, czd $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cse(bwo<? extends cse> $$0, bxe $$1, dja $$2, czd $$3) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3);
      this.c($$1);
   }

   public void a(czd $$0) {
      this.au().a(a, $$0.c(1));
   }

   protected abstract cyz g();

   @Override
   public czd f() {
      return this.au().a(a);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(a, new czd(this.g()));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Item", this.f().a(this.dX()));
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(czd.a(this.dX(), (uw)$$0.p("Item")).orElseGet(() -> new czd(this.g())));
      } else {
         this.a(new czd(this.g()));
      }
   }
}

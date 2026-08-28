public abstract class crt extends cru implements crj {
   private static final akh<cys> a = akl.a(crt.class, akj.h);

   public crt(bwj<? extends crt> $$0, dip $$1) {
      super($$0, $$1);
   }

   public crt(bwj<? extends crt> $$0, double $$1, double $$2, double $$3, dip $$4, cys $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public crt(bwj<? extends crt> $$0, bwz $$1, dip $$2, cys $$3) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3);
      this.c($$1);
   }

   public void a(cys $$0) {
      this.au().a(a, $$0.c(1));
   }

   protected abstract cyo f();

   @Override
   public cys ae_() {
      return this.au().a(a);
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(a, new cys(this.f()));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Item", this.ae_().a(this.dX()));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cys.a(this.dX(), (uu)$$0.p("Item")).orElseGet(() -> new cys(this.f())));
      } else {
         this.a(new cys(this.f()));
      }
   }
}

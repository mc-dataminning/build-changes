public abstract class coy extends coz implements coo {
   private static final akh<cvs> b = akl.a(coy.class, akj.h);

   public coy(bty<? extends coy> $$0, dej $$1) {
      super($$0, $$1);
   }

   public coy(bty<? extends coy> $$0, double $$1, double $$2, double $$3, dej $$4, cvs $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public coy(bty<? extends coy> $$0, bun $$1, dej $$2, cvs $$3) {
      this($$0, $$1.dx(), $$1.dB() - 0.1F, $$1.dD(), $$2, $$3);
      this.c($$1);
   }

   public void a(cvs $$0) {
      this.at().a(b, $$0.c(1));
   }

   protected abstract cvn o();

   @Override
   public cvs m() {
      return this.at().a(b);
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(b, new cvs(this.o()));
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Item", this.m().a(this.dU()));
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cvs.a(this.dU(), (vd)$$0.p("Item")).orElseGet(() -> new cvs(this.o())));
      } else {
         this.a(new cvs(this.o()));
      }
   }
}

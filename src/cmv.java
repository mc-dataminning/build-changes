public abstract class cmv extends cmw implements cml {
   private static final ajr<cto> b = ajv.a(cmv.class, ajt.h);

   public cmv(bsa<? extends cmv> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cmv(bsa<? extends cmv> $$0, double $$1, double $$2, double $$3, dax $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cmv(bsa<? extends cmv> $$0, bso $$1, dax $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cto $$0) {
      this.ap().a(b, $$0.c(1));
   }

   protected abstract ctj u();

   @Override
   public cto p() {
      return this.ap().a(b);
   }

   @Override
   protected void a(ajv.a $$0) {
      $$0.a(b, new cto(this.u()));
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dR()));
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cto.a(this.dR(), (va)$$0.p("Item")).orElseGet(() -> new cto(this.u())));
      } else {
         this.a(new cto(this.u()));
      }
   }
}

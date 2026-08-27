public abstract class cmi extends cmd implements cml {
   private static final ajr<cto> e = ajv.a(cmi.class, ajt.h);

   public cmi(bsa<? extends cmi> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cmi(bsa<? extends cmi> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dax $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cmi(bsa<? extends cmi> $$0, bso $$1, double $$2, double $$3, double $$4, dax $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cto $$0) {
      if ($$0.e()) {
         this.ap().a(e, this.y());
      } else {
         this.ap().a(e, $$0.c(1));
      }
   }

   @Override
   public cto p() {
      return this.ap().a(e);
   }

   @Override
   protected void a(ajv.a $$0) {
      $$0.a(e, this.y());
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
         this.a(cto.a(this.dR(), (va)$$0.p("Item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }
   }

   private cto y() {
      return new cto(ctr.tX);
   }
}

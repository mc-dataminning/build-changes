public abstract class ckm extends ckh implements ckp {
   private static final aja<crs> e = aje.a(ckm.class, ajc.h);

   public ckm(bqg<? extends ckm> $$0, czg $$1) {
      super($$0, $$1);
   }

   public ckm(bqg<? extends ckm> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, czg $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public ckm(bqg<? extends ckm> $$0, bqt $$1, double $$2, double $$3, double $$4, czg $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(crs $$0) {
      if ($$0.d()) {
         this.an().a(e, this.y());
      } else {
         this.an().a(e, $$0.c(1));
      }
   }

   @Override
   public crs p() {
      return this.an().a(e);
   }

   @Override
   protected void a(aje.a $$0) {
      $$0.a(e, this.y());
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dO()));
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(crs.a(this.dO(), (ul)$$0.p("Item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }
   }

   private crs y() {
      return new crs(crv.tW);
   }
}

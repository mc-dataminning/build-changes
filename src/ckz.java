public abstract class ckz extends cla implements ckp {
   private static final aja<crs> b = aje.a(ckz.class, ajc.h);

   public ckz(bqg<? extends ckz> $$0, czg $$1) {
      super($$0, $$1);
   }

   public ckz(bqg<? extends ckz> $$0, double $$1, double $$2, double $$3, czg $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public ckz(bqg<? extends ckz> $$0, bqt $$1, czg $$2) {
      super($$0, $$1, $$2);
   }

   public void a(crs $$0) {
      this.an().a(b, $$0.c(1));
   }

   protected abstract crn r();

   @Override
   public crs p() {
      return this.an().a(b);
   }

   @Override
   protected void a(aje.a $$0) {
      $$0.a(b, new crs(this.r()));
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
         this.a(crs.a(this.dO(), (ul)$$0.p("Item")).orElseGet(() -> new crs(this.r())));
      } else {
         this.a(new crs(this.r()));
      }
   }
}

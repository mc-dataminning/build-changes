public abstract class cmg extends cmh implements clw {
   private static final ajm<csz> b = ajq.a(cmg.class, ajo.h);

   public cmg(brn<? extends cmg> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cmg(brn<? extends cmg> $$0, double $$1, double $$2, double $$3, dad $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cmg(brn<? extends cmg> $$0, bsa $$1, dad $$2) {
      super($$0, $$1, $$2);
   }

   public void a(csz $$0) {
      this.an().a(b, $$0.c(1));
   }

   protected abstract csu r();

   @Override
   public csz p() {
      return this.an().a(b);
   }

   @Override
   protected void a(ajq.a $$0) {
      $$0.a(b, new csz(this.r()));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dP()));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(csz.a(this.dP(), (ux)$$0.p("Item")).orElseGet(() -> new csz(this.r())));
      } else {
         this.a(new csz(this.r()));
      }
   }
}

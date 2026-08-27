public abstract class cmz extends cna implements cmo {
   private static final ajy<cuh> b = akc.a(cmz.class, aka.h);

   public cmz(bsb<? extends cmz> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cmz(bsb<? extends cmz> $$0, double $$1, double $$2, double $$3, dca $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cmz(bsb<? extends cmz> $$0, bso $$1, dca $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cuh $$0) {
      this.ap().a(b, $$0.c(1));
   }

   protected abstract cuc r();

   @Override
   public cuh p() {
      return this.ap().a(b);
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(b, new cuh(this.r()));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dY()));
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cuh.a(this.dY(), (vh)$$0.p("Item")).orElseGet(() -> new cuh(this.r())));
      } else {
         this.a(new cuh(this.r()));
      }
   }
}

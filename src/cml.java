public abstract class cml extends cmf implements cmo {
   private static final ajy<cuh> e = akc.a(cml.class, aka.h);

   public cml(bsb<? extends cml> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cml(bsb<? extends cml> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dca $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cml(bsb<? extends cml> $$0, bso $$1, double $$2, double $$3, double $$4, dca $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cuh $$0) {
      if ($$0.d()) {
         this.ap().a(e, this.y());
      } else {
         this.ap().a(e, $$0.c(1));
      }
   }

   @Override
   public cuh p() {
      return this.ap().a(e);
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(e, this.y());
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
         this.a(cuh.a(this.dY(), (vh)$$0.p("Item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }
   }

   private cuh y() {
      return new cuh(cuk.vz);
   }
}

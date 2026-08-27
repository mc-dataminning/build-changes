public class fao extends ezh {
   private final cow m;

   public fao(cow $$0) {
      this.m = $$0;
   }

   @Override
   public cow l() {
      return this.m;
   }

   @Override
   int C() {
      return 150;
   }

   @Override
   protected void aI_() {
      super.aI_();
      this.a.a(this.l().m());
   }

   @Override
   protected void a(cow $$0) {
      if ($$0 instanceof cdt.a $$1) {
         this.f.J().b(new acq($$1.h().ai(), this.a.a(), $$0.o()));
      }
   }
}

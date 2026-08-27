public class faj extends ezc {
   private final cpc m;

   public faj(cpc $$0) {
      this.m = $$0;
   }

   @Override
   public cpc l() {
      return this.m;
   }

   @Override
   int D() {
      return 150;
   }

   @Override
   protected void aH_() {
      super.aH_();
      this.a.a(this.l().m());
   }

   @Override
   protected void a(cpc $$0) {
      if ($$0 instanceof cdz.a $$1) {
         this.f.J().b(new acq($$1.h().ah(), this.a.a(), $$0.o()));
      }
   }
}

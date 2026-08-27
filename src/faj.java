public class faj extends ezc {
   private final cor m;

   public faj(cor $$0) {
      this.m = $$0;
   }

   @Override
   public cor l() {
      return this.m;
   }

   @Override
   int C() {
      return 150;
   }

   @Override
   protected void aD_() {
      super.aD_();
      this.a.a(this.l().m());
   }

   @Override
   protected void a(cor $$0) {
      if ($$0 instanceof cdo.a $$1) {
         this.f.J().b(new acn($$1.h().ah(), this.a.a(), $$0.o()));
      }
   }
}

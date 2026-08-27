public class faq extends ezj {
   private final coy m;

   public faq(coy $$0) {
      this.m = $$0;
   }

   @Override
   public coy l() {
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
   protected void a(coy $$0) {
      if ($$0 instanceof cdv.a $$1) {
         this.f.J().b(new acr($$1.h().ah(), this.a.a(), $$0.o()));
      }
   }
}

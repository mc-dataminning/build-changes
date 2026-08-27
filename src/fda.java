public class fda extends fbs {
   private final crb m;

   public fda(crb $$0) {
      this.m = $$0;
   }

   @Override
   public crb l() {
      return this.m;
   }

   @Override
   int C() {
      return 150;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.a.a(this.l().m());
   }

   @Override
   protected void a(crb $$0) {
      if ($$0 instanceof cft.a $$1) {
         this.f.I().b(new adz($$1.h().aj(), this.a.a(), $$0.o()));
      }
   }
}

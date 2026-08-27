public class fbi extends fab {
   private final cqa m;

   public fbi(cqa $$0) {
      this.m = $$0;
   }

   @Override
   public cqa l() {
      return this.m;
   }

   @Override
   int C() {
      return 150;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.a.a(this.l().m());
   }

   @Override
   protected void a(cqa $$0) {
      if ($$0 instanceof cew.a $$1) {
         this.f.J().b(new adn($$1.h().ah(), this.a.a(), $$0.o()));
      }
   }
}

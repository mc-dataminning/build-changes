public class fcn extends fbf {
   private final cqt m;

   public fcn(cqt $$0) {
      this.m = $$0;
   }

   @Override
   public cqt l() {
      return this.m;
   }

   @Override
   int C() {
      return 150;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.a.a(this.l().m());
   }

   @Override
   protected void a(cqt $$0) {
      if ($$0 instanceof cfl.a $$1) {
         this.f.I().b(new adx($$1.h().ah(), this.a.a(), $$0.o()));
      }
   }
}

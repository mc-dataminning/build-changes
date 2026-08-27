public class fdf extends fbx {
   private final crg m;

   public fdf(crg $$0) {
      this.m = $$0;
   }

   @Override
   public crg l() {
      return this.m;
   }

   @Override
   int C() {
      return 150;
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.a.a(this.l().m());
   }

   @Override
   protected void a(crg $$0) {
      if ($$0 instanceof cfy.a $$1) {
         this.f.I().b(new aed($$1.h().aj(), this.a.a(), $$0.o()));
      }
   }
}

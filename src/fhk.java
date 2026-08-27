public class fhk extends fgc {
   private final cuo m;

   public fhk(cuo $$0) {
      this.m = $$0;
   }

   @Override
   public cuo o() {
      return this.m;
   }

   @Override
   int E() {
      return 150;
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.a.a(this.o().m());
   }

   @Override
   protected void a(cuo $$0) {
      if ($$0 instanceof cji.a $$1) {
         this.f.J().b(new agf($$1.h().aj(), this.a.a(), $$0.o()));
      }
   }
}

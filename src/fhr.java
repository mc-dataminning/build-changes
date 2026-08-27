public class fhr extends fgj {
   private final cus m;

   public fhr(cus $$0) {
      this.m = $$0;
   }

   @Override
   public cus o() {
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
   protected void a(cus $$0) {
      if ($$0 instanceof cjm.a $$1) {
         this.f.K().b(new agf($$1.h().aj(), this.a.a(), $$0.o()));
      }
   }
}

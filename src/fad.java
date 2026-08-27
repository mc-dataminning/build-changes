public class fad extends eyw {
   private final com m;

   public fad(com $$0) {
      this.m = $$0;
   }

   @Override
   public com l() {
      return this.m;
   }

   @Override
   int B() {
      return 150;
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.a.a(this.l().m());
   }

   @Override
   protected void a(com $$0) {
      if ($$0 instanceof cdm.a $$1) {
         this.f.J().b(new ack($$1.h().ah(), this.a.a(), $$0.o()));
      }
   }
}

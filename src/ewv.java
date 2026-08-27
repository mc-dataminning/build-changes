public class ewv extends evo {
   private final cln m;

   public ewv(cln $$0) {
      this.m = $$0;
   }

   @Override
   public cln l() {
      return this.m;
   }

   @Override
   int B() {
      return 150;
   }

   @Override
   protected void b() {
      super.b();
      this.a.a(this.l().m());
   }

   @Override
   protected void a(cln $$0) {
      if ($$0 instanceof can.a $$1) {
         this.f.I().a(new aaq($$1.h().af(), this.a.b(), $$0.o()));
      }
   }
}

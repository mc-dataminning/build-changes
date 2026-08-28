import javax.annotation.Nullable;

public class fcl extends fch {
   @Nullable
   private jh b;
   @Nullable
   private jh c;

   protected fcl(crv $$0, boolean $$1) {
      super($$0, $$1);
      this.a($$0);
   }

   private void a(crv $$0) {
      jh $$1 = $$0.p();
      dxu $$2 = $$0.dW().a_($$1);
      boolean $$3 = dka.h($$2);
      if ($$3) {
         this.b = $$1.e();
         dyx $$4 = $$2.c(((dka)$$2.b()).c());
         if ($$4.b()) {
            this.c = switch ($$4) {
               case c -> $$1.i();
               case d -> $$1.h();
               case e -> $$1.f();
               case f -> $$1.g();
               default -> null;
            };
         }
      }
   }

   @Override
   public fcr a(dxu $$0, dgq $$1, jh $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : fco.a();
   }
}

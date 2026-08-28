import javax.annotation.Nullable;

public class fcl extends fch {
   @Nullable
   private ji b;
   @Nullable
   private ji c;

   protected fcl(crq $$0, boolean $$1) {
      super($$0, $$1);
      this.a($$0);
   }

   private void a(crq $$0) {
      ji $$1 = $$0.j();
      dxq $$2 = $$0.dU().a_($$1);
      boolean $$3 = djt.h($$2);
      if ($$3) {
         this.b = $$1.e();
         dyu $$4 = $$2.c(((djt)$$2.b()).c());
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
   public fcr a(dxq $$0, dgj $$1, ji $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : fco.a();
   }
}

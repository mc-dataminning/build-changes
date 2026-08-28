import javax.annotation.Nullable;

public class fcg extends fcc {
   @Nullable
   private jh b;
   @Nullable
   private jh c;

   protected fcg(crr $$0, boolean $$1) {
      super($$0, $$1);
      this.a($$0);
   }

   private void a(crr $$0) {
      jh $$1 = $$0.p();
      dxn $$2 = $$0.dV().a_($$1);
      boolean $$3 = djt.h($$2);
      if ($$3) {
         this.b = $$1.e();
         dyq $$4 = $$2.c(((djt)$$2.b()).c());
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
   public fcm a(dxn $$0, dgj $$1, jh $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : fcj.a();
   }
}

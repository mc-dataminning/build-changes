import javax.annotation.Nullable;

public class fbp extends fbl {
   @Nullable
   private ji b;
   @Nullable
   private ji c;

   protected fbp(cqx $$0, boolean $$1) {
      super($$0, $$1);
      this.a($$0);
   }

   private void a(cqx $$0) {
      ji $$1 = $$0.p();
      dwy $$2 = $$0.dV().a_($$1);
      boolean $$3 = djc.h($$2);
      if ($$3) {
         this.b = $$1.e();
         dyb $$4 = $$2.c(((djc)$$2.b()).c());
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
   public fbv a(dwy $$0, dfs $$1, ji $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : fbs.a();
   }
}

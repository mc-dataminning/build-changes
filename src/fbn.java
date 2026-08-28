import javax.annotation.Nullable;

public class fbn extends fbj {
   @Nullable
   private ji b;
   @Nullable
   private ji c;

   protected fbn(cqv $$0, boolean $$1) {
      super($$0, $$1);
      this.a($$0);
   }

   private void a(cqv $$0) {
      ji $$1 = $$0.p();
      dww $$2 = $$0.dV().a_($$1);
      boolean $$3 = dja.h($$2);
      if ($$3) {
         this.b = $$1.e();
         dxz $$4 = $$2.c(((dja)$$2.b()).c());
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
   public fbt a(dww $$0, dfq $$1, ji $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : fbq.a();
   }
}

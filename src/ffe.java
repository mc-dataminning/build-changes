import javax.annotation.Nullable;

public class ffe extends ffa {
   @Nullable
   private iu b;
   @Nullable
   private iu c;

   protected ffe(ctp $$0, boolean $$1) {
      super($$0, $$1);
      this.a($$0);
   }

   private void a(ctp $$0) {
      iu $$1 = $$0.j();
      eah $$2 = $$0.dV().a_($$1);
      boolean $$3 = dlu.h($$2);
      if ($$3) {
         this.b = $$1.e();
         ebl $$4 = $$2.c(((dlu)$$2.b()).c());
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
   public ffk a(eah $$0, dik $$1, iu $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : ffh.a();
   }
}

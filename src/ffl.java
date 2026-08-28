import javax.annotation.Nullable;

public class ffl extends ffh {
   @Nullable
   private iv b;
   @Nullable
   private iv c;

   protected ffl(ctw $$0, boolean $$1) {
      super($$0, $$1, false);
      this.a($$0);
   }

   private void a(ctw $$0) {
      iv $$1 = $$0.j();
      eao $$2 = $$0.dU().a_($$1);
      boolean $$3 = dmb.h($$2);
      if ($$3) {
         this.b = $$1.e();
         ebs $$4 = $$2.c(((dmb)$$2.b()).c());
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
   public ffr a(eao $$0, dir $$1, iv $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : ffo.a();
   }
}

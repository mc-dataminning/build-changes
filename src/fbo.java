import javax.annotation.Nullable;

public class fbo extends fbk {
   @Nullable
   private ji b;
   @Nullable
   private ji c;

   protected fbo(cqw $$0, boolean $$1) {
      super($$0, $$1);
      this.a($$0);
   }

   private void a(cqw $$0) {
      ji $$1 = $$0.p();
      dwx $$2 = $$0.dW().a_($$1);
      boolean $$3 = djb.h($$2);
      if ($$3) {
         this.b = $$1.e();
         dya $$4 = $$2.c(((djb)$$2.b()).c());
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
   public fbu a(dwx $$0, dfr $$1, ji $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : fbr.a();
   }
}

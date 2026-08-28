import javax.annotation.Nullable;

public class ezg extends ezc {
   @Nullable
   private je b;
   @Nullable
   private je c;

   protected ezg(cps $$0, boolean $$1) {
      super($$0, $$1);
      this.a($$0);
   }

   private void a(cps $$0) {
      je $$1 = $$0.q();
      duo $$2 = $$0.dS().a_($$1);
      boolean $$3 = dgy.h($$2);
      if ($$3) {
         this.b = $$1.e();
         dvs $$4 = $$2.c(((dgy)$$2.b()).c());
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
   public ezm a(duo $$0, ddp $$1, je $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : ezj.a();
   }
}

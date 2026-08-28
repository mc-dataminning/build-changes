import javax.annotation.Nullable;

public class ezv extends ezr {
   @Nullable
   private jg b;
   @Nullable
   private jg c;

   protected ezv(cqf $$0, boolean $$1) {
      super($$0, $$1);
      this.a($$0);
   }

   private void a(cqf $$0) {
      jg $$1 = $$0.q();
      dvd $$2 = $$0.dX().a_($$1);
      boolean $$3 = dhn.h($$2);
      if ($$3) {
         this.b = $$1.e();
         dwh $$4 = $$2.c(((dhn)$$2.b()).c());
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
   public fab a(dvd $$0, dee $$1, jg $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : ezy.a();
   }
}

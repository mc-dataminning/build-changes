import javax.annotation.Nullable;

public class fab extends ezx {
   @Nullable
   private jh b;
   @Nullable
   private jh c;

   protected fab(cqk $$0, boolean $$1) {
      super($$0, $$1);
      this.a($$0);
   }

   private void a(cqk $$0) {
      jh $$1 = $$0.q();
      dvj $$2 = $$0.dX().a_($$1);
      boolean $$3 = dht.h($$2);
      if ($$3) {
         this.b = $$1.e();
         dwn $$4 = $$2.c(((dht)$$2.b()).c());
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
   public fah a(dvj $$0, dek $$1, jh $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : fae.a();
   }
}

import javax.annotation.Nullable;

public class faf extends fab {
   @Nullable
   private jh b;
   @Nullable
   private jh c;

   protected faf(cqo $$0, boolean $$1) {
      super($$0, $$1);
      this.a($$0);
   }

   private void a(cqo $$0) {
      jh $$1 = $$0.q();
      dvo $$2 = $$0.dY().a_($$1);
      boolean $$3 = dhy.h($$2);
      if ($$3) {
         this.b = $$1.e();
         dwr $$4 = $$2.c(((dhy)$$2.b()).c());
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
   public fal a(dvo $$0, deo $$1, jh $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : fai.a();
   }
}

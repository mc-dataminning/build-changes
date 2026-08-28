import javax.annotation.Nullable;

public class fge extends fga {
   @Nullable
   private iv b;
   @Nullable
   private iv c;

   protected fge(cuk $$0, boolean $$1) {
      super($$0, $$1, false);
      this.a($$0);
   }

   private void a(cuk $$0) {
      iv $$1 = $$0.j();
      ebe $$2 = $$0.dV().a_($$1);
      boolean $$3 = dmr.h($$2);
      if ($$3) {
         this.b = $$1.e();
         eci $$4 = $$2.c(((dmr)$$2.b()).c());
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
   public fgk a(ebe $$0, djf $$1, iv $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : fgh.a();
   }
}

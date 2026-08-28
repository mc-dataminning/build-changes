import javax.annotation.Nullable;

public class fgg extends fgc {
   @Nullable
   private iw b;
   @Nullable
   private iw c;

   protected fgg(cum $$0, boolean $$1) {
      super($$0, $$1, false);
      this.a($$0);
   }

   private void a(cum $$0) {
      iw $$1 = $$0.j();
      ebg $$2 = $$0.dV().a_($$1);
      boolean $$3 = dmt.h($$2);
      if ($$3) {
         this.b = $$1.e();
         eck $$4 = $$2.c(((dmt)$$2.b()).c());
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
   public fgm a(ebg $$0, djh $$1, iw $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : fgj.a();
   }
}

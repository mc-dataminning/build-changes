import javax.annotation.Nullable;

public class fgq extends fgm {
   @Nullable
   private iw b;
   @Nullable
   private iw c;

   protected fgq(cuv $$0, boolean $$1) {
      super($$0, $$1, false);
      this.a($$0);
   }

   private void a(cuv $$0) {
      iw $$1 = $$0.j();
      ebq $$2 = $$0.dV().a_($$1);
      boolean $$3 = dnd.h($$2);
      if ($$3) {
         this.b = $$1.e();
         ecu $$4 = $$2.c(((dnd)$$2.b()).c());
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
   public fgw a(ebq $$0, djr $$1, iw $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : fgt.a();
   }
}

import javax.annotation.Nullable;

public class ezk extends ezg {
   @Nullable
   private jf b;
   @Nullable
   private jf c;

   protected ezk(cpv $$0, boolean $$1) {
      super($$0, $$1);
      this.a($$0);
   }

   private void a(cpv $$0) {
      jf $$1 = $$0.q();
      dus $$2 = $$0.dS().a_($$1);
      boolean $$3 = dhb.h($$2);
      if ($$3) {
         this.b = $$1.e();
         dvw $$4 = $$2.c(((dhb)$$2.b()).c());
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
   public ezq a(dus $$0, dds $$1, jf $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : ezn.a();
   }
}

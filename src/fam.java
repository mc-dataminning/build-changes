import javax.annotation.Nullable;

public class fam extends fai {
   @Nullable
   private jh b;
   @Nullable
   private jh c;

   protected fam(cqt $$0, boolean $$1) {
      super($$0, $$1);
      this.a($$0);
   }

   private void a(cqt $$0) {
      jh $$1 = $$0.n();
      dvv $$2 = $$0.dV().a_($$1);
      boolean $$3 = dif.h($$2);
      if ($$3) {
         this.b = $$1.e();
         dwy $$4 = $$2.c(((dif)$$2.b()).c());
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
   public fas a(dvv $$0, dev $$1, jh $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : fap.a();
   }
}

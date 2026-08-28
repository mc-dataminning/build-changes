import javax.annotation.Nullable;

public class fdi extends fde {
   @Nullable
   private jj b;
   @Nullable
   private jj c;

   protected fdi(csh $$0, boolean $$1) {
      super($$0, $$1);
      this.a($$0);
   }

   private void a(csh $$0) {
      jj $$1 = $$0.j();
      dym $$2 = $$0.dV().a_($$1);
      boolean $$3 = dkj.h($$2);
      if ($$3) {
         this.b = $$1.e();
         dzq $$4 = $$2.c(((dkj)$$2.b()).c());
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
   public fdo a(dym $$0, dgz $$1, jj $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : fdl.a();
   }
}

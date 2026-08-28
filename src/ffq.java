import javax.annotation.Nullable;

public class ffq extends ffm {
   @Nullable
   private iv b;
   @Nullable
   private iv c;

   protected ffq(ctz $$0, boolean $$1) {
      super($$0, $$1, false);
      this.a($$0);
   }

   private void a(ctz $$0) {
      iv $$1 = $$0.j();
      eat $$2 = $$0.dU().a_($$1);
      boolean $$3 = dmg.h($$2);
      if ($$3) {
         this.b = $$1.e();
         ebx $$4 = $$2.c(((dmg)$$2.b()).c());
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
   public ffw a(eat $$0, diu $$1, iv $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : fft.a();
   }
}

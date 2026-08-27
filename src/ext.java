import java.util.Arrays;
import java.util.stream.Stream;

public class ext extends exx {
   private eth c;

   private static eqs<?>[] a(eqt $$0) {
      return new eqs[]{$$0.c(), $$0.N(), $$0.C(), $$0.O(), $$0.V()};
   }

   public ext(eye $$0, eqt $$1) {
      super($$0, $$1, tl.c("options.mouse_settings.title"));
   }

   @Override
   protected void aH_() {
      this.c = new eth(this.f, this.g, this.h, 32, this.h - 32, 25);
      if (eke.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.D())).toArray(eqs[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.e(this.c);
      this.d(esk.a(tk.d, $$0 -> {
         this.b.ar();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(erz $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

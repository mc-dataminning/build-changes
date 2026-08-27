import java.util.Arrays;
import java.util.stream.Stream;

public class exo extends exs {
   private etd c;

   private static eqo<?>[] a(eqp $$0) {
      return new eqo[]{$$0.c(), $$0.N(), $$0.C(), $$0.O(), $$0.V()};
   }

   public exo(eya $$0, eqp $$1) {
      super($$0, $$1, tf.c("options.mouse_settings.title"));
   }

   @Override
   protected void aC_() {
      this.c = new etd(this.f, this.g, this.h, 32, this.h - 32, 25);
      if (eka.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.D())).toArray(eqo[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.e(this.c);
      this.d(esg.a(te.d, $$0 -> {
         this.b.ar();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

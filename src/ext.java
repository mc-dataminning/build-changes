import java.util.Arrays;
import java.util.stream.Stream;

public class ext extends exx {
   private eti c;

   private static eqt<?>[] a(equ $$0) {
      return new eqt[]{$$0.c(), $$0.N(), $$0.C(), $$0.O(), $$0.V()};
   }

   public ext(eyf $$0, equ $$1) {
      super($$0, $$1, ti.c("options.mouse_settings.title"));
   }

   @Override
   protected void aD_() {
      this.c = new eti(this.f, this.g, this.h, 32, this.h - 32, 25);
      if (ekf.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.D())).toArray(eqt[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.e(this.c);
      this.d(esl.a(th.d, $$0 -> {
         this.b.ar();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

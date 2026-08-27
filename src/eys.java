import java.util.Arrays;
import java.util.stream.Stream;

public class eys extends eyw {
   private eug c;

   private static err<?>[] a(ers $$0) {
      return new err[]{$$0.c(), $$0.N(), $$0.C(), $$0.O(), $$0.V()};
   }

   public eys(ezd $$0, ers $$1) {
      super($$0, $$1, ui.c("options.mouse_settings.title"));
   }

   @Override
   protected void aM_() {
      this.c = new eug(this.f, this.g, this.h, 32, this.h - 32, 25);
      if (elc.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.D())).toArray(err[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.e(this.c);
      this.d(etj.a(uh.d, $$0 -> {
         this.b.ar();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

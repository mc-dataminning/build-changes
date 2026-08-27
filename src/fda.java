import java.util.Arrays;
import java.util.stream.Stream;

public class fda extends fde {
   private eyo c;

   private static evu<?>[] a(evv $$0) {
      return new evu[]{$$0.d(), $$0.O(), $$0.D(), $$0.P(), $$0.W()};
   }

   public fda(fdm $$0, evv $$1) {
      super($$0, $$1, vg.c("options.mouse_settings.title"));
   }

   @Override
   protected void aP_() {
      this.c = this.d(new eyo(this.f, this.g, this.h - 64, 32, 25));
      if (epf.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.E())).toArray(evu[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.d(exr.a(vf.d, $$0 -> {
         this.b.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

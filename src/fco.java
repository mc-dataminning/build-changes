import java.util.Arrays;
import java.util.stream.Stream;

public class fco extends fcs {
   private eyc c;

   private static evk<?>[] a(evl $$0) {
      return new evk[]{$$0.d(), $$0.O(), $$0.D(), $$0.P(), $$0.W()};
   }

   public fco(fda $$0, evl $$1) {
      super($$0, $$1, vf.c("options.mouse_settings.title"));
   }

   @Override
   protected void aN_() {
      this.c = this.d(new eyc(this.f, this.g, this.h - 64, 32, 25));
      if (eov.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.E())).toArray(evk[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.d(exf.a(ve.d, $$0 -> {
         this.b.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(ewt $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

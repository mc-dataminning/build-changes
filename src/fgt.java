import java.util.Arrays;
import java.util.stream.Stream;

public class fgt extends fgx {
   private fcd c;

   private static ezj<?>[] a(ezk $$0) {
      return new ezj[]{$$0.d(), $$0.P(), $$0.D(), $$0.Q(), $$0.X()};
   }

   public fgt(fhf $$0, ezk $$1) {
      super($$0, $$1, vu.c("options.mouse_settings.title"));
   }

   @Override
   protected void aO_() {
      this.c = this.c(new fcd(this.f, this.g, this.h - 64, 32, 25));
      if (esu.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.E())).toArray(ezj[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.c(fbg.a(vt.d, $$0 -> {
         this.b.at();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

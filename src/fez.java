import java.util.Arrays;
import java.util.stream.Stream;

public class fez extends ffd {
   private fal c;

   private static exr<?>[] a(exs $$0) {
      return new exr[]{$$0.d(), $$0.O(), $$0.D(), $$0.P(), $$0.W()};
   }

   public fez(ffl $$0, exs $$1) {
      super($$0, $$1, vq.c("options.mouse_settings.title"));
   }

   @Override
   protected void aQ_() {
      this.c = this.c(new fal(this.f, this.g, this.h - 64, 32, 25));
      if (erc.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.E())).toArray(exr[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.c(ezo.a(vp.d, $$0 -> {
         this.b.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

import java.util.Arrays;
import java.util.stream.Stream;

public class fcn extends fcr {
   private eyb c;

   private static evj<?>[] a(evk $$0) {
      return new evj[]{$$0.d(), $$0.O(), $$0.D(), $$0.P(), $$0.W()};
   }

   public fcn(fcz $$0, evk $$1) {
      super($$0, $$1, vf.c("options.mouse_settings.title"));
   }

   @Override
   protected void aN_() {
      this.c = this.d(new eyb(this.f, this.g, this.h - 64, 32, 25));
      if (eou.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.E())).toArray(evj[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.d(exe.a(ve.d, $$0 -> {
         this.b.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(ews $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

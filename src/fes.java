import java.util.Arrays;
import java.util.stream.Stream;

public class fes extends few {
   private fae c;

   private static exk<?>[] a(exl $$0) {
      return new exk[]{$$0.d(), $$0.O(), $$0.D(), $$0.P(), $$0.W()};
   }

   public fes(ffe $$0, exl $$1) {
      super($$0, $$1, vq.c("options.mouse_settings.title"));
   }

   @Override
   protected void aQ_() {
      this.c = this.d(new fae(this.f, this.g, this.h - 64, 32, 25));
      if (eqv.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.E())).toArray(exk[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.d(ezh.a(vp.d, $$0 -> {
         this.b.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(eyu $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

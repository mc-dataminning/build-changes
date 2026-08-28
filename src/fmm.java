import java.util.Arrays;
import java.util.stream.Stream;

public class fmm extends fmq {
   private static final xl a = xl.c("options.mouse_settings.title");
   private final fkm r = new fkm(this);
   private fhw s;

   private static ffd<?>[] a(ffe $$0) {
      return new ffd[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public fmm(fmy $$0, ffe $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      this.s = this.c(new fhw(this.m, this.n, this.o, this));
      if (eyo.a()) {
         this.s.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(ffd[]::new));
      } else {
         this.s.a(a(this.c));
      }

      super.aN_();
   }

   @Override
   protected void c() {
      super.c();
      this.s.a(this.n, this.r);
   }
}

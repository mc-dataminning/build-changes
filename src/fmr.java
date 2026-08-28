import java.util.Arrays;
import java.util.stream.Stream;

public class fmr extends fmv {
   private static final xp a = xp.c("options.mouse_settings.title");
   private final fkr r = new fkr(this);
   private fib s;

   private static ffi<?>[] a(ffj $$0) {
      return new ffi[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public fmr(fnd $$0, ffj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fib(this.m, this.n, this.o, this));
      if (eyt.a()) {
         this.s.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(ffi[]::new));
      } else {
         this.s.a(a(this.c));
      }

      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      this.s.a(this.n, this.r);
   }
}

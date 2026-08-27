import java.util.Arrays;
import java.util.stream.Stream;

public class foa extends foe {
   private static final xe a = xe.c("options.mouse_settings.title");
   private final fma r = new fma(this);
   private fjk s;

   private static fgm<?>[] a(fgn $$0) {
      return new fgm[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public foa(fon $$0, fgn $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      this.s = this.c(new fjk(this.m, this.n, this.o, this));
      if (ezx.a()) {
         this.s.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(fgm[]::new));
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

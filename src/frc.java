import java.util.Arrays;
import java.util.stream.Stream;

public class frc extends frf {
   private static final wz a = wz.c("options.mouse_settings.title");

   private static fgp<?>[] a(fgq $$0) {
      return new fgp[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public frc(fob $$0, fgq $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fac.a()) {
         this.r.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(fgp[]::new));
      } else {
         this.r.a(a(this.c));
      }
   }
}

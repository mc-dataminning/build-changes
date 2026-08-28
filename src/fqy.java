import java.util.Arrays;
import java.util.stream.Stream;

public class fqy extends frb {
   private static final wy a = wy.c("options.mouse_settings.title");

   private static fgl<?>[] a(fgm $$0) {
      return new fgl[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public fqy(fnx $$0, fgm $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (ezy.a()) {
         this.q.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(fgl[]::new));
      } else {
         this.q.a(a(this.c));
      }
   }
}

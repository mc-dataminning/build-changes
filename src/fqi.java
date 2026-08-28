import java.util.Arrays;
import java.util.stream.Stream;

public class fqi extends fql {
   private static final wu a = wu.c("options.mouse_settings.title");

   private static ffw<?>[] a(ffx $$0) {
      return new ffw[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public fqi(fnj $$0, ffx $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (ezh.a()) {
         this.q.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(ffw[]::new));
      } else {
         this.q.a(a(this.c));
      }
   }
}

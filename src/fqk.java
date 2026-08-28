import java.util.Arrays;
import java.util.stream.Stream;

public class fqk extends fqn {
   private static final wu a = wu.c("options.mouse_settings.title");

   private static ffz<?>[] a(fga $$0) {
      return new ffz[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public fqk(fnl $$0, fga $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (ezj.a()) {
         this.q.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(ffz[]::new));
      } else {
         this.q.a(a(this.c));
      }
   }
}

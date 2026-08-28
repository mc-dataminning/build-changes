import java.util.Arrays;
import java.util.stream.Stream;

public class fua extends fud {
   private static final xi a = xi.c("options.mouse_settings.title");

   private static fjl<?>[] a(fjm $$0) {
      return new fjl[]{$$0.d(), $$0.T(), $$0.G(), $$0.U(), $$0.ab()};
   }

   public fua(fra $$0, fjm $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fcw.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.H())).toArray(fjl[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}

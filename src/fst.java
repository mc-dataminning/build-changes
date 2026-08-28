import java.util.Arrays;
import java.util.stream.Stream;

public class fst extends fsw {
   private static final xd a = xd.c("options.mouse_settings.title");

   private static fie<?>[] a(fif $$0) {
      return new fie[]{$$0.d(), $$0.T(), $$0.G(), $$0.U(), $$0.ab()};
   }

   public fst(fpt $$0, fif $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fbk.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.H())).toArray(fie[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}

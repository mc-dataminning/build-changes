import java.util.Arrays;
import java.util.stream.Stream;

public class fth extends ftk {
   private static final xe a = xe.c("options.mouse_settings.title");

   private static fis<?>[] a(fit $$0) {
      return new fis[]{$$0.d(), $$0.T(), $$0.G(), $$0.U(), $$0.ab()};
   }

   public fth(fqh $$0, fit $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fcd.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.H())).toArray(fis[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}

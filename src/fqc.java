import java.util.Arrays;
import java.util.stream.Stream;

public class fqc extends fqf {
   private static final wu a = wu.c("options.mouse_settings.title");

   private static ffq<?>[] a(ffr $$0) {
      return new ffq[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public fqc(fnd $$0, ffr $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (ezb.a()) {
         this.q.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(ffq[]::new));
      } else {
         this.q.a(a(this.c));
      }
   }
}

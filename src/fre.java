import java.util.Arrays;
import java.util.stream.Stream;

public class fre extends frh {
   private static final wz a = wz.c("options.mouse_settings.title");

   private static fgr<?>[] a(fgs $$0) {
      return new fgr[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public fre(fod $$0, fgs $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fae.a()) {
         this.r.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(fgr[]::new));
      } else {
         this.r.a(a(this.c));
      }
   }
}

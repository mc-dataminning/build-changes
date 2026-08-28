import java.util.Arrays;
import java.util.stream.Stream;

public class fmt extends fmx {
   private static final xp a = xp.c("options.mouse_settings.title");
   private final fkt r = new fkt(this);
   private fid s;

   private static ffk<?>[] a(ffl $$0) {
      return new ffk[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public fmt(fnf $$0, ffl $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fid(this.m, this.n, this.o, this));
      if (eyv.a()) {
         this.s.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(ffk[]::new));
      } else {
         this.s.a(a(this.c));
      }

      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      this.s.a(this.n, this.r);
   }
}

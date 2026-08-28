import java.util.Arrays;
import java.util.stream.Stream;

public class fms extends fmw {
   private static final xp a = xp.c("options.mouse_settings.title");
   private final fks r = new fks(this);
   private fic s;

   private static ffj<?>[] a(ffk $$0) {
      return new ffj[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public fms(fne $$0, ffk $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fic(this.m, this.n, this.o, this));
      if (eyu.a()) {
         this.s.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(ffj[]::new));
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

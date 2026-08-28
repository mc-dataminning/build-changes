import java.util.Arrays;
import java.util.stream.Stream;

public class fmp extends fmt {
   private static final xo a = xo.c("options.mouse_settings.title");
   private final fkp r = new fkp(this);
   private fhz s;

   private static ffg<?>[] a(ffh $$0) {
      return new ffg[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public fmp(fnb $$0, ffh $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fhz(this.m, this.n, this.o, this));
      if (eyr.a()) {
         this.s.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(ffg[]::new));
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

import java.util.Arrays;
import java.util.stream.Stream;

public class fmq extends fmu {
   private static final xo a = xo.c("options.mouse_settings.title");
   private final fkq r = new fkq(this);
   private fia s;

   private static ffh<?>[] a(ffi $$0) {
      return new ffh[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public fmq(fnc $$0, ffi $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fia(this.m, this.n, this.o, this));
      if (eys.a()) {
         this.s.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(ffh[]::new));
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

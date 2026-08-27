import java.util.Arrays;
import java.util.stream.Stream;

public class fkr extends fkv {
   private static final wu a = wu.c("options.mouse_settings.title");
   private final fir r = new fir(this);
   private fgb s;

   private static fdh<?>[] a(fdi $$0) {
      return new fdh[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public fkr(fld $$0, fdi $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fgb(this.m, this.n, this.o, this));
      if (ews.a()) {
         this.s.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(fdh[]::new));
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

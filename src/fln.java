import java.util.Arrays;
import java.util.stream.Stream;

public class fln extends flr {
   private static final wx a = wx.c("options.mouse_settings.title");
   private final fjn r = new fjn(this);
   private fgx s;

   private static fee<?>[] a(fef $$0) {
      return new fee[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public fln(flz $$0, fef $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      this.s = this.c(new fgx(this.m, this.n, this.o, this));
      if (exp.a()) {
         this.s.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(fee[]::new));
      } else {
         this.s.a(a(this.c));
      }

      super.aN_();
   }

   @Override
   protected void c() {
      super.c();
      this.s.a(this.n, this.r);
   }
}

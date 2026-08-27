import java.util.Arrays;
import java.util.stream.Stream;

public class flm extends flq {
   private static final wx a = wx.c("options.mouse_settings.title");
   private final fjm r = new fjm(this);
   private fgw s;

   private static fec<?>[] a(fed $$0) {
      return new fec[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public flm(fly $$0, fed $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fgw(this.m, this.n, this.o, this));
      if (exn.a()) {
         this.s.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(fec[]::new));
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

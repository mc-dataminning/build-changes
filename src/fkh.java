import java.util.Arrays;
import java.util.stream.Stream;

public class fkh extends fkl {
   private static final ws a = ws.c("options.mouse_settings.title");
   private final fih r = new fih(this);
   private ffr s;

   private static fcx<?>[] a(fcy $$0) {
      return new fcx[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public fkh(fkt $$0, fcy $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.s = this.c(new ffr(this.m, this.n, this.o, this));
      if (ewi.a()) {
         this.s.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(fcx[]::new));
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

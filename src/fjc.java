import java.util.Arrays;
import java.util.stream.Stream;

public class fjc extends fjg {
   private static final wg a = wg.c("options.mouse_settings.title");
   private final fhc o = new fhc(this);
   private fem p;

   private static fbs<?>[] a(fbt $$0) {
      return new fbs[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public fjc(fjo $$0, fbt $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      this.p = this.c(new fem(this.j, this.k, this.l, this));
      if (evd.a()) {
         this.p.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(fbs[]::new));
      } else {
         this.p.a(a(this.c));
      }

      super.aN_();
   }

   @Override
   public void d() {
      this.c.av();
      super.d();
   }

   @Override
   protected void c() {
      super.c();
      this.p.a(this.k, this.o);
   }
}

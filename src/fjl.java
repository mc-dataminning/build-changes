import java.util.Arrays;
import java.util.stream.Stream;

public class fjl extends fjp {
   private static final wi a = wi.c("options.mouse_settings.title");
   private final fhl o = new fhl(this);
   private fev p;

   private static fcb<?>[] a(fcc $$0) {
      return new fcb[]{$$0.d(), $$0.R(), $$0.F(), $$0.S(), $$0.Z()};
   }

   public fjl(fjx $$0, fcc $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.p = this.c(new fev(this.j, this.k, this.l, this));
      if (evm.a()) {
         this.p.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.G())).toArray(fcb[]::new));
      } else {
         this.p.a(a(this.c));
      }

      super.aM_();
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

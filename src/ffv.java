import java.util.Arrays;
import java.util.stream.Stream;

public class ffv extends ffz {
   private fbh c;

   private static eyn<?>[] a(eyo $$0) {
      return new eyn[]{$$0.d(), $$0.O(), $$0.D(), $$0.P(), $$0.W()};
   }

   public ffv(fgh $$0, eyo $$1) {
      super($$0, $$1, vs.c("options.mouse_settings.title"));
   }

   @Override
   protected void aP_() {
      this.c = this.c(new fbh(this.f, this.g, this.h - 64, 32, 25));
      if (ery.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.E())).toArray(eyn[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.c(fak.a(vr.d, $$0 -> {
         this.b.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

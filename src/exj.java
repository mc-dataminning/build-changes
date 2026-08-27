import java.util.Arrays;
import java.util.stream.Stream;

public class exj extends exn {
   private etf c;

   private static eqq<?>[] a(eqr $$0) {
      return new eqq[]{$$0.c(), $$0.M(), $$0.B(), $$0.N(), $$0.U()};
   }

   public exj(exv $$0, eqr $$1) {
      super($$0, $$1, te.c("options.mouse_settings.title"));
   }

   @Override
   protected void aE_() {
      this.c = new etf(this.f, this.g, this.h, 32, this.h - 32, 25);
      if (ekc.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.C())).toArray(eqq[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.e(this.c);
      this.d(esi.a(td.d, $$0 -> {
         this.b.aq();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

import java.util.Arrays;
import java.util.stream.Stream;

public class exy extends eyc {
   private etn c;

   private static eqy<?>[] a(eqz $$0) {
      return new eqy[]{$$0.c(), $$0.N(), $$0.C(), $$0.O(), $$0.V()};
   }

   public exy(eyk $$0, eqz $$1) {
      super($$0, $$1, tl.c("options.mouse_settings.title"));
   }

   @Override
   protected void aH_() {
      this.c = new etn(this.f, this.g, this.h, 32, this.h - 32, 25);
      if (ekk.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.D())).toArray(eqy[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.e(this.c);
      this.d(esq.a(tk.d, $$0 -> {
         this.b.ar();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

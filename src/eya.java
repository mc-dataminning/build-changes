import java.util.Arrays;
import java.util.stream.Stream;

public class eya extends eye {
   private etp c;

   private static era<?>[] a(erb $$0) {
      return new era[]{$$0.c(), $$0.N(), $$0.C(), $$0.O(), $$0.V()};
   }

   public eya(eym $$0, erb $$1) {
      super($$0, $$1, tn.c("options.mouse_settings.title"));
   }

   @Override
   protected void aH_() {
      this.c = new etp(this.f, this.g, this.h, 32, this.h - 32, 25);
      if (ekm.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.D())).toArray(era[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.e(this.c);
      this.d(ess.a(tm.d, $$0 -> {
         this.b.ar();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

import java.util.Arrays;
import java.util.stream.Stream;

public class fgv extends fgz {
   private fcf c;

   private static ezl<?>[] a(ezm $$0) {
      return new ezl[]{$$0.d(), $$0.P(), $$0.D(), $$0.Q(), $$0.X()};
   }

   public fgv(fhh $$0, ezm $$1) {
      super($$0, $$1, vu.c("options.mouse_settings.title"));
   }

   @Override
   protected void aO_() {
      this.c = this.c(new fcf(this.f, this.g, this.h - 64, 32, 25));
      if (esw.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.E())).toArray(ezl[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.c(fbi.a(vt.d, $$0 -> {
         this.b.at();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(fav $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

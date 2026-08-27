import java.util.Arrays;
import java.util.stream.Stream;

public class ezv extends ezz {
   private evj c;

   private static esu<?>[] a(esv $$0) {
      return new esu[]{$$0.d(), $$0.O(), $$0.D(), $$0.P(), $$0.W()};
   }

   public ezv(fah $$0, esv $$1) {
      super($$0, $$1, ur.c("options.mouse_settings.title"));
   }

   @Override
   protected void aO_() {
      this.c = new evj(this.f, this.g, this.h, 32, this.h - 32, 25);
      if (emf.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.E())).toArray(esu[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.e(this.c);
      this.d(eum.a(uq.d, $$0 -> {
         this.b.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

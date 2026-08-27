import java.util.Arrays;
import java.util.stream.Stream;

public class fan extends far {
   private ewb c;

   private static etl<?>[] a(etm $$0) {
      return new etl[]{$$0.d(), $$0.O(), $$0.D(), $$0.P(), $$0.W()};
   }

   public fan(faz $$0, etm $$1) {
      super($$0, $$1, uv.c("options.mouse_settings.title"));
   }

   @Override
   protected void aQ_() {
      this.c = new ewb(this.f, this.g, this.h, 32, this.h - 32, 25);
      if (emw.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.E())).toArray(etl[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.e(this.c);
      this.d(eve.a(uu.d, $$0 -> {
         this.b.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

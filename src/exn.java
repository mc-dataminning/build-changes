import java.util.Arrays;
import java.util.stream.Stream;

public class exn extends exr {
   private ete c;

   private static eqp<?>[] a(eqq $$0) {
      return new eqp[]{$$0.c(), $$0.M(), $$0.B(), $$0.N(), $$0.U()};
   }

   public exn(exz $$0, eqq $$1) {
      super($$0, $$1, tf.c("options.mouse_settings.title"));
   }

   @Override
   protected void aE_() {
      this.c = new ete(this.f, this.g, this.h, 32, this.h - 32, 25);
      if (ekb.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.C())).toArray(eqp[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.e(this.c);
      this.d(esh.a(te.d, $$0 -> {
         this.b.aq();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
   }

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

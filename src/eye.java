import java.util.Arrays;

public class eye extends exs {
   private etd c;

   private static eqo<?>[] a(eqp $$0) {
      return new eqo[]{$$0.S(), $$0.T()};
   }

   public eye(eya $$0, eqp $$1) {
      super($$0, $$1, tf.c("options.sounds.title"));
   }

   @Override
   protected void aC_() {
      this.c = new etd(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.c.a(this.b.b(aox.a));
      this.c.a(this.l());
      this.c.a(this.b.ap());
      this.c.a(a(this.b));
      this.e(this.c);
      this.d(esg.a(te.d, $$0 -> {
         this.f.m.ar();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private eqo<?>[] l() {
      return Arrays.stream(aox.values()).filter($$0 -> $$0 != aox.a).map($$0 -> this.b.b($$0)).toArray(eqo[]::new);
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.c, $$1, $$2, $$3);
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

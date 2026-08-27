import java.util.Arrays;

public class eyd extends exr {
   private ete c;

   private static eqp<?>[] a(eqq $$0) {
      return new eqp[]{$$0.R(), $$0.S()};
   }

   public eyd(exz $$0, eqq $$1) {
      super($$0, $$1, tf.c("options.sounds.title"));
   }

   @Override
   protected void aE_() {
      this.c = new ete(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.c.a(this.b.b(aox.a));
      this.c.a(this.l());
      this.c.a(this.b.ao());
      this.c.a(a(this.b));
      this.e(this.c);
      this.d(esh.a(te.d, $$0 -> {
         this.f.m.aq();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private eqp<?>[] l() {
      return Arrays.stream(aox.values()).filter($$0 -> $$0 != aox.a).map($$0 -> this.b.b($$0)).toArray(eqp[]::new);
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.c, $$1, $$2, $$3);
   }

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

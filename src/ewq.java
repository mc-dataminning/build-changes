import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ewq extends gpb {
   protected BooleanConsumer a;
   private final vu b;
   private final vu c;

   public ewq(BooleanConsumer $$0, vu $$1, vu $$2) {
      super(eyy.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aO_() {
      this.c(fbg.a(vt.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, g(9), 100, 20).a());
      this.c(fbg.a(vt.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b, this.g / 2, g(3), -1);
      $$0.a(this.i, this.c, this.g / 2, g(5), -1);
   }
}

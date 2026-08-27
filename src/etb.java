import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class etb extends gld {
   protected BooleanConsumer a;
   private final vg b;
   private final vg c;

   public etb(BooleanConsumer $$0, vg $$1, vg $$2) {
      super(evj.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aP_() {
      this.d(exr.a(vf.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, g(9), 100, 20).a());
      this.d(exr.a(vf.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b, this.g / 2, g(3), -1);
      $$0.a(this.i, this.c, this.g / 2, g(5), -1);
   }
}

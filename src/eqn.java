import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eqn extends ghr {
   protected BooleanConsumer a;
   private final ur b;
   private final ur c;

   public eqn(BooleanConsumer $$0, ur $$1, ur $$2) {
      super(esv.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aP_() {
      this.d(euz.a(uq.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(9), 100, 20).a());
      this.d(euz.a(uq.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(9), 100, 20).a());
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b, this.g / 2, h(3), -1);
      $$0.a(this.i, this.c, this.g / 2, h(5), -1);
   }
}

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eqb extends ghe {
   protected BooleanConsumer a;
   private final ur b;
   private final ur c;

   public eqb(BooleanConsumer $$0, ur $$1, ur $$2) {
      super(esj.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aO_() {
      this.d(eum.a(uq.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(9), 100, 20).a());
      this.d(eum.a(uq.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(9), 100, 20).a());
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b, this.g / 2, h(3), -1);
      $$0.a(this.i, this.c, this.g / 2, h(5), -1);
   }
}

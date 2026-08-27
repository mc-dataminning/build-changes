import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eru extends gjl {
   protected BooleanConsumer a;
   private final vb b;
   private final vb c;

   public eru(BooleanConsumer $$0, vb $$1, vb $$2) {
      super(euc.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aP_() {
      this.d(ewh.a(va.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(9), 100, 20).a());
      this.d(ewh.a(va.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(9), 100, 20).a());
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b, this.g / 2, h(3), -1);
      $$0.a(this.i, this.c, this.g / 2, h(5), -1);
   }
}

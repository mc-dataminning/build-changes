import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eoi extends gfd {
   protected BooleanConsumer a;
   private final tn b;
   private final tn c;

   public eoi(BooleanConsumer $$0, tn $$1, tn $$2) {
      super(eqp.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aH_() {
      this.d(ess.a(tm.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(9), 100, 20).a());
      this.d(ess.a(tm.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(9), 100, 20).a());
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b, this.g / 2, h(3), -1);
      $$0.a(this.i, this.c, this.g / 2, h(5), -1);
   }
}

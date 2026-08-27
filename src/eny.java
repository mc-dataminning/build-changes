import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eny extends gei {
   protected BooleanConsumer a;
   private final tf b;
   private final tf c;

   public eny(BooleanConsumer $$0, tf $$1, tf $$2) {
      super(eqe.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aE_() {
      this.d(esh.a(te.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(9), 100, 20).a());
      this.d(esh.a(te.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(9), 100, 20).a());
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b, this.g / 2, h(3), -1);
      $$0.a(this.i, this.c, this.g / 2, h(5), -1);
   }
}

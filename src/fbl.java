import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fbl extends gty {
   protected BooleanConsumer a;
   private final wx b;
   private final wx c;

   public fbl(BooleanConsumer $$0, wx $$1, wx $$2) {
      super(fdt.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aN_() {
      this.c(fga.a(ww.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(9), 100, 20).a());
      this.c(fga.a(ww.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b, this.n / 2, g(3), -1);
      $$0.a(this.p, this.c, this.n / 2, g(5), -1);
   }
}

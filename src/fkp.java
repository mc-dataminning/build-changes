import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fkp extends hne {
   protected BooleanConsumer a;
   private final wv b;
   private final wv c;

   public fkp(BooleanConsumer $$0, wv $$1, wv $$2) {
      super(fmu.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aN_() {
      this.c(fqn.a(wu.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(9), 100, 20).a());
      this.c(fqn.a(wu.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b, this.n / 2, g(3), -1);
      $$0.a(this.p, this.c, this.n / 2, g(5), -1);
   }
}

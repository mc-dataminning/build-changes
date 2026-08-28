import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fhk extends hff {
   protected BooleanConsumer a;
   private final xl b;
   private final xl c;

   public fhk(BooleanConsumer $$0, xl $$1, xl $$2) {
      super(fjo.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aS_() {
      this.c(flw.a(xk.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(9), 100, 20).a());
      this.c(flw.a(xk.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b, this.n / 2, g(3), -1);
      $$0.a(this.p, this.c, this.n / 2, g(5), -1);
   }
}

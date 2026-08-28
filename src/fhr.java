import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fhr extends hfq {
   protected BooleanConsumer a;
   private final xj b;
   private final xj c;

   public fhr(BooleanConsumer $$0, xj $$1, xj $$2) {
      super(fjv.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aR_() {
      this.c(fmd.a(xi.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(9), 100, 20).a());
      this.c(fmd.a(xi.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b, this.n / 2, g(3), -1);
      $$0.a(this.p, this.c, this.n / 2, g(5), -1);
   }
}

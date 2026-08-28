import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fob extends hrc {
   protected BooleanConsumer a;
   private final xg b;
   private final xg c;

   public fob(BooleanConsumer $$0, xg $$1, xg $$2) {
      super(fqh.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aO_() {
      this.c(fty.a(xf.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(9), 100, 20).a());
      this.c(fty.a(xf.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b, this.n / 2, g(3), -1);
      $$0.a(this.p, this.c, this.n / 2, g(5), -1);
   }
}

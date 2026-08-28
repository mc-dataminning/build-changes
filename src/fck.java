import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fck extends gvb {
   protected BooleanConsumer a;
   private final xl b;
   private final xl c;

   public fck(BooleanConsumer $$0, xl $$1, xl $$2) {
      super(fes.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aN_() {
      this.c(fgz.a(xk.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(9), 100, 20).a());
      this.c(fgz.a(xk.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b, this.n / 2, g(3), -1);
      $$0.a(this.p, this.c, this.n / 2, g(5), -1);
   }
}

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class foq extends hro {
   protected BooleanConsumer a;
   private final xc b;
   private final xc c;

   public foq(BooleanConsumer $$0, xc $$1, xc $$2) {
      super(fqw.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aS_() {
      this.c(fun.a(xb.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(9), 100, 20).a());
      this.c(fun.a(xb.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b, this.n / 2, g(3), -1);
      $$0.a(this.p, this.c, this.n / 2, g(5), -1);
   }
}

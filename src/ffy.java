import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ffy extends hdp {
   protected BooleanConsumer a;
   private final xe b;
   private final xe c;

   public ffy(BooleanConsumer $$0, xe $$1, xe $$2) {
      super(fig.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aS_() {
      this.c(fko.a(xd.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(9), 100, 20).a());
      this.c(fko.a(xd.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b, this.n / 2, g(3), -1);
      $$0.a(this.p, this.c, this.n / 2, g(5), -1);
   }
}

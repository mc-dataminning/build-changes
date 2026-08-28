import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fjm extends hhp {
   protected BooleanConsumer a;
   private final xv b;
   private final xv c;

   public fjm(BooleanConsumer $$0, xv $$1, xv $$2) {
      super(flq.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aT_() {
      this.c(fny.a(xu.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(9), 100, 20).a());
      this.c(fny.a(xu.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b, this.n / 2, g(3), -1);
      $$0.a(this.p, this.c, this.n / 2, g(5), -1);
   }
}

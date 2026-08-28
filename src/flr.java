import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class flr extends hol {
   protected BooleanConsumer a;
   private final ww b;
   private final ww c;

   public flr(BooleanConsumer $$0, ww $$1, ww $$2) {
      super(fnw.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aN_() {
      this.c(frq.a(wv.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(9), 100, 20).a());
      this.c(frq.a(wv.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b, this.n / 2, g(3), -1);
      $$0.a(this.p, this.c, this.n / 2, g(5), -1);
   }
}

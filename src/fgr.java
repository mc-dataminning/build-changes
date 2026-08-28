import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fgr extends hep {
   protected BooleanConsumer a;
   private final xi b;
   private final xi c;

   public fgr(BooleanConsumer $$0, xi $$1, xi $$2) {
      super(fiz.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aR_() {
      this.c(flh.a(xh.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(9), 100, 20).a());
      this.c(flh.a(xh.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b, this.n / 2, g(3), -1);
      $$0.a(this.p, this.c, this.n / 2, g(5), -1);
   }
}

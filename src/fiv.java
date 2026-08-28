import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fiv extends hkx {
   protected BooleanConsumer a;
   private final wo b;
   private final wo c;

   public fiv(BooleanConsumer $$0, wo $$1, wo $$2) {
      super(fla.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aR_() {
      this.c(fos.a(wn.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(9), 100, 20).a());
      this.c(fos.a(wn.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b, this.n / 2, g(3), -1);
      $$0.a(this.p, this.c, this.n / 2, g(5), -1);
   }
}

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ezi extends gru {
   protected BooleanConsumer a;
   private final wi b;
   private final wi c;

   public ezi(BooleanConsumer $$0, wi $$1, wi $$2) {
      super(fbq.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aM_() {
      this.c(fdy.a(wh.f, $$0 -> this.a.accept(true)).a(this.k / 2 - 105, g(9), 100, 20).a());
      this.c(fdy.a(wh.g, $$0 -> this.a.accept(false)).a(this.k / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.b, this.k / 2, g(3), -1);
      $$0.a(this.m, this.c, this.k / 2, g(5), -1);
   }
}

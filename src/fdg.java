import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fdg extends gvu {
   protected BooleanConsumer a;
   private final wu b;
   private final wu c;

   public fdg(BooleanConsumer $$0, wu $$1, wu $$2) {
      super(ffo.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aP_() {
      this.c(fhu.a(wt.f, $$0 -> this.a.accept(true)).a(this.m / 2 - 105, g(9), 100, 20).a());
      this.c(fhu.a(wt.g, $$0 -> this.a.accept(false)).a(this.m / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.b, this.m / 2, g(3), -1);
      $$0.a(this.o, this.c, this.m / 2, g(5), -1);
   }
}

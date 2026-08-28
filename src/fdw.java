import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fdw extends gwo {
   protected BooleanConsumer a;
   private final wz b;
   private final wz c;

   public fdw(BooleanConsumer $$0, wz $$1, wz $$2) {
      super(fge.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aT_() {
      this.c(fik.a(wy.f, $$0 -> this.a.accept(true)).a(this.m / 2 - 105, g(9), 100, 20).a());
      this.c(fik.a(wy.g, $$0 -> this.a.accept(false)).a(this.m / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.b, this.m / 2, g(3), -1);
      $$0.a(this.o, this.c, this.m / 2, g(5), -1);
   }
}

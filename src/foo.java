import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class foo extends hrm {
   protected BooleanConsumer a;
   private final xa b;
   private final xa c;

   public foo(BooleanConsumer $$0, xa $$1, xa $$2) {
      super(fqu.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aS_() {
      this.c(ful.a(wz.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(9), 100, 20).a());
      this.c(ful.a(wz.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b, this.n / 2, g(3), -1);
      $$0.a(this.p, this.c, this.n / 2, g(5), -1);
   }
}

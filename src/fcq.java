import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fcq extends gvh {
   protected BooleanConsumer a;
   private final xp b;
   private final xp c;

   public fcq(BooleanConsumer $$0, xp $$1, xp $$2) {
      super(fey.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aM_() {
      this.c(fhf.a(xo.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(9), 100, 20).a());
      this.c(fhf.a(xo.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b, this.n / 2, g(3), -1);
      $$0.a(this.p, this.c, this.n / 2, g(5), -1);
   }
}

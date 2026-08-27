import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class elb extends gan {
   protected BooleanConsumer a;
   private final sw b;
   private final sw c;

   public elb(BooleanConsumer $$0, sw $$1, sw $$2) {
      super(enf.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void b() {
      this.d(epi.a(sv.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(9), 100, 20).a());
      this.d(epi.a(sv.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(9), 100, 20).a());
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(this.i, this.b, this.g / 2, h(3), 16777215);
      $$0.a(this.i, this.c, this.g / 2, h(5), 16777215);
      super.a($$0, $$1, $$2, $$3);
   }
}

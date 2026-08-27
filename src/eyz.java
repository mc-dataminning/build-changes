import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eyz extends grl {
   protected BooleanConsumer a;
   private final wg b;
   private final wg c;

   public eyz(BooleanConsumer $$0, wg $$1, wg $$2) {
      super(fbh.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aN_() {
      this.c(fdp.a(wf.f, $$0 -> this.a.accept(true)).a(this.k / 2 - 105, g(9), 100, 20).a());
      this.c(fdp.a(wf.g, $$0 -> this.a.accept(false)).a(this.k / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.b, this.k / 2, g(3), -1);
      $$0.a(this.m, this.c, this.k / 2, g(5), -1);
   }
}

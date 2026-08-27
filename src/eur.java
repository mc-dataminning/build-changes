import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eur extends gmv {
   protected BooleanConsumer a;
   private final vq b;
   private final vq c;

   public eur(BooleanConsumer $$0, vq $$1, vq $$2) {
      super(ewz.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aQ_() {
      this.d(ezh.a(vp.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, g(9), 100, 20).a());
      this.d(ezh.a(vp.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b, this.g / 2, g(3), -1);
      $$0.a(this.i, this.c, this.g / 2, g(5), -1);
   }
}

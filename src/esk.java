import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class esk extends gkc {
   protected BooleanConsumer a;
   private final vd b;
   private final vd c;

   public esk(BooleanConsumer $$0, vd $$1, vd $$2) {
      super(eus.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aN_() {
      this.d(ewy.a(vc.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, g(9), 100, 20).a());
      this.d(ewy.a(vc.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b, this.g / 2, g(3), -1);
      $$0.a(this.i, this.c, this.g / 2, g(5), -1);
   }
}

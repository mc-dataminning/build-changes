import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class evu extends gob {
   protected BooleanConsumer a;
   private final vs b;
   private final vs c;

   public evu(BooleanConsumer $$0, vs $$1, vs $$2) {
      super(eyc.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aP_() {
      this.c(fak.a(vr.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, g(9), 100, 20).a());
      this.c(fak.a(vr.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b, this.g / 2, g(3), -1);
      $$0.a(this.i, this.c, this.g / 2, g(5), -1);
   }
}

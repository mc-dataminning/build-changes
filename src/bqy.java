import java.util.function.ToIntFunction;

class bqy extends bra {
   private final float a;
   private final ToIntFunction<ayk> b;

   protected bqy(brb $$0, int $$1, float $$2, ToIntFunction<ayk> $$3) {
      super($$0, $$1, ky.G);
      this.a = $$2;
      this.b = $$3;
   }

   @Override
   public void a(bso $$0, int $$1, bqn $$2, float $$3) {
      if ($$0.el().i() <= this.a) {
         int $$4 = this.b.applyAsInt($$0.el());

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.a($$0.dP(), $$0.du(), $$0.dw() + 0.5, $$0.dA());
         }
      }
   }

   private void a(dax $$0, double $$1, double $$2, double $$3) {
      cjj $$4 = bsa.aM.a($$0);
      if ($$4 != null) {
         $$4.b($$1, $$2, $$3, $$0.E_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }
}

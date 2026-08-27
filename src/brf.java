import java.util.function.ToIntFunction;

class brf extends bra {
   private final ToIntFunction<ayk> a;

   protected brf(brb $$0, int $$1, ToIntFunction<ayk> $$2) {
      super($$0, $$1, ky.U);
      this.a = $$2;
   }

   @Override
   public void a(bso $$0, int $$1, bru.c $$2) {
      if ($$2 == bru.c.a) {
         int $$3 = this.a.applyAsInt($$0.el());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.a($$0.dP(), $$0.du(), $$0.dw() + 0.5, $$0.dA());
         }
      }
   }

   private void a(dax $$0, double $$1, double $$2, double $$3) {
      cjl $$4 = bsa.aP.a($$0);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.E_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }
}

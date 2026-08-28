import com.mojang.serialization.MapCodec;

public abstract class dlf extends dmm {
   protected static final int a = 4;
   private static final ffr c = dmm.b(12.0, 4.0, 16.0);
   private static final ffr d = ag.a(() -> {
      int $$0 = 4;
      int $$1 = 3;
      int $$2 = 2;
      return ffo.a(ffo.b(), ffo.a(dmm.a(16.0, 8.0, 0.0, 3.0), dmm.a(8.0, 16.0, 0.0, 3.0), dmm.b(12.0, 0.0, 3.0), c), ffb.e);
   });
   protected final kc.a b;

   @Override
   protected abstract MapCodec<? extends dlf> a();

   public dlf(ean.d $$0, kc.a $$1) {
      super($$0);
      this.b = $$1;
   }

   protected double b(eao $$0) {
      return 0.0;
   }

   protected boolean a(eao $$0, iv $$1, bwi $$2) {
      return $$2.dB() < (double)$$1.v() + this.b($$0) && $$2.cQ().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      kc $$7 = this.b.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return d;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2) {
      return c;
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   public abstract boolean d(eao var1);

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      iv $$4 = dsk.a((djh)$$1, $$2);
      if ($$4 != null) {
         ewu $$5 = dsk.a($$1, $$4);
         if ($$5 != eww.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(ewu $$0) {
      return false;
   }

   protected void a(eao $$0, djh $$1, iv $$2, ewu $$3) {
   }
}

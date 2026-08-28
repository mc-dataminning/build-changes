import com.mojang.serialization.MapCodec;

public class dlo extends dvy implements dmp {
   public static final MapCodec<dlo> a = b(dlo::new);
   private static final ffr b = ffo.a(dmm.b(16.0, 8.0, 16.0), dmm.b(4.0, 0.0, 8.0));

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   protected dlo(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b;
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      return $$0.a(dmo.ei) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      eac.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}

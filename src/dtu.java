import com.mojang.serialization.MapCodec;

public class dtu extends doz implements dmp {
   public static final MapCodec<dtu> b = b(dtu::new);
   private static final ffr c = dmm.b(12.0, 0.0, 10.0);

   @Override
   public MapCodec<dtu> a() {
      return b;
   }

   protected dtu(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c;
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return true;
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      $$0.b($$2, dmo.bF.m());
   }
}

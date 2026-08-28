import com.mojang.serialization.MapCodec;

public class dva extends doz implements dmp {
   public static final MapCodec<dva> b = b(dva::new);
   private static final ffr c = dmm.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dva> a() {
      return b;
   }

   protected dva(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c;
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return dmp.a_($$0, $$1, dmo.bE.m());
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      dmp.a((djh)$$0, $$2, dmo.bE.m()).ifPresent($$1x -> $$0.b($$1x, dmo.bE.m()));
   }
}

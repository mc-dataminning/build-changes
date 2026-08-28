import com.mojang.serialization.MapCodec;

public class drr extends dmm {
   public static final MapCodec<drr> a = b(drr::new);
   private static final ffr b = dmm.b(16.0, 0.0, 14.0);

   @Override
   public MapCodec<drr> a() {
      return a;
   }

   public drr(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b;
   }

   @Override
   protected ffr b_(eao $$0, din $$1, iv $$2) {
      return ffo.b();
   }

   @Override
   protected ffr c(eao $$0, din $$1, iv $$2, ffc $$3) {
      return ffo.b();
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   @Override
   protected float c(eao $$0, din $$1, iv $$2) {
      return 0.2F;
   }
}

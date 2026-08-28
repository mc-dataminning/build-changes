import com.mojang.serialization.MapCodec;

public class dng extends doj {
   public static final MapCodec<dng> a = b(dng::new);
   private static final ffr[] b = dmm.a(7, $$0 -> dmm.b(16.0, 0.0, (double)(2 + $$0)));

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   public dng(ean.d $$0) {
      super($$0);
   }

   @Override
   protected djg d() {
      return czo.vp;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b[this.h($$0)];
   }
}

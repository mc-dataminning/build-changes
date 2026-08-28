import com.mojang.serialization.MapCodec;

public class dlu extends dlw {
   public static final MapCodec<dlu> a = b(dlu::new);
   private static final ffr c = dmm.b(12.0, 0.0, 4.0);

   @Override
   public MapCodec<? extends dlu> a() {
      return a;
   }

   protected dlu(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c;
   }
}

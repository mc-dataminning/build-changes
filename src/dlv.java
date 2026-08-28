import com.mojang.serialization.MapCodec;

public class dlv extends dlw {
   public static final MapCodec<dlv> a = b(dlv::new);
   private static final ffr c = dmm.b(12.0, 0.0, 15.0);

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   protected dlv(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c;
   }
}

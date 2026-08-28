import com.mojang.serialization.MapCodec;

public class duv extends dmm {
   public static final MapCodec<duv> a = b(duv::new);
   private static final ffr b = dmm.a(6.0);

   @Override
   public MapCodec<duv> a() {
      return a;
   }

   protected duv(ean.d $$0) {
      super($$0);
   }

   @Override
   protected dsz a_(eao $$0) {
      return dsz.a;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b;
   }

   @Override
   protected float c(eao $$0, din $$1, iv $$2) {
      return 1.0F;
   }
}

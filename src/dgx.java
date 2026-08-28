import com.mojang.serialization.MapCodec;

public class dgx extends dfh {
   public static final MapCodec<dgx> a = b(dgx::new);
   protected static final float b = 6.0F;
   protected static final ewj c = dey.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dgx> a() {
      return a;
   }

   protected dgx(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return c;
   }

   @Override
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return $$0.a(awo.cl);
   }
}

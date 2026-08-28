import com.mojang.serialization.MapCodec;

public class deh extends dei {
   public static final MapCodec<deh> a = b(deh::new);
   protected static final float b = 6.0F;
   protected static final ewj c = dey.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<deh> a() {
      return a;
   }

   protected deh(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return c;
   }
}

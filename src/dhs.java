import com.mojang.serialization.MapCodec;

public class dhs extends dht {
   public static final MapCodec<dhs> a = b(dhs::new);
   protected static final float b = 6.0F;
   protected static final fal c = dij.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dhs> a() {
      return a;
   }

   protected dhs(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return c;
   }
}

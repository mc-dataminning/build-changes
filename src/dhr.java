import com.mojang.serialization.MapCodec;

public class dhr extends dht {
   public static final MapCodec<dhr> a = b(dhr::new);
   private static final fal b = dij.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends dhr> a() {
      return a;
   }

   protected dhr(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b;
   }
}

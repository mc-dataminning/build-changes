import com.mojang.serialization.MapCodec;

public class dju extends djv {
   public static final MapCodec<dju> a = b(dju::new);
   protected static final float b = 6.0F;
   protected static final fcr c = dkl.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dju> a() {
      return a;
   }

   protected dju(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return c;
   }
}

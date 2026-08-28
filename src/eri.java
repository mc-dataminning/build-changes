import com.mojang.serialization.MapCodec;

public class eri extends esf {
   public static final MapCodec<eri> a = MapCodec.unit(() -> eri.b);
   public static final eri b = new eri();

   private eri() {
   }

   @Override
   public boolean a(dxq $$0, azh $$1) {
      return true;
   }

   @Override
   protected esg<?> a() {
      return esg.a;
   }
}

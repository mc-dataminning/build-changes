import com.mojang.serialization.MapCodec;

public class eri extends esf {
   public static final MapCodec<eri> a = MapCodec.unit(() -> eri.b);
   public static final eri b = new eri();

   private eri() {
   }

   @Override
   public boolean a(dxu $$0, bam $$1) {
      return true;
   }

   @Override
   protected esg<?> a() {
      return esg.a;
   }
}

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class eff extends efg {
   public static final MapCodec<eff> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eff::new));

   public eff(km $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dxq $$0) {
      return $$0.e();
   }

   @Override
   public eew<?> a() {
      return eew.e;
   }
}

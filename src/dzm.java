import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dzm extends dzn {
   public static final MapCodec<dzm> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzm::new));

   public dzm(kd $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsd $$0) {
      return $$0.e();
   }

   @Override
   public dzd<?> a() {
      return dzd.e;
   }
}

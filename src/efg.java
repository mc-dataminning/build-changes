import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class efg extends efh {
   public static final MapCodec<efg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, efg::new));

   public efg(kl $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dxu $$0) {
      return $$0.e();
   }

   @Override
   public eex<?> a() {
      return eex.e;
   }
}

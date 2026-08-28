import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dzg extends dzh {
   public static final MapCodec<dzg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzg::new));

   public dzg(kd $$0) {
      super($$0);
   }

   @Override
   protected boolean a(drx $$0) {
      return $$0.e();
   }

   @Override
   public dyx<?> a() {
      return dyx.e;
   }
}

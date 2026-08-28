import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class egc extends egd {
   public static final MapCodec<egc> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, egc::new));

   public egc(kn $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dym $$0) {
      return $$0.e();
   }

   @Override
   public eft<?> a() {
      return eft.e;
   }
}

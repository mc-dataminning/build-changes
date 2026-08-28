import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class ecw extends ecx {
   public static final MapCodec<ecw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ecw::new));

   public ecw(kl $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dvj $$0) {
      return $$0.e();
   }

   @Override
   public ecn<?> a() {
      return ecn.e;
   }
}

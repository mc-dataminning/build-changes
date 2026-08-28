import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class ecb extends ecc {
   public static final MapCodec<ecb> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ecb::new));

   public ecb(ki $$0) {
      super($$0);
   }

   @Override
   protected boolean a(duo $$0) {
      return $$0.e();
   }

   @Override
   public ebs<?> a() {
      return ebs.e;
   }
}

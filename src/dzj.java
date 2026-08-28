import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dzj extends dzk {
   public static final MapCodec<dzj> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzj::new));

   public dzj(kd $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsa $$0) {
      return $$0.e();
   }

   @Override
   public dza<?> a() {
      return dza.e;
   }
}

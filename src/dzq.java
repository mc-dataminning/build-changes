import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dzq extends dzr {
   public static final MapCodec<dzq> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzq::new));

   public dzq(ke $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsh $$0) {
      return $$0.e();
   }

   @Override
   public dzh<?> a() {
      return dzh.e;
   }
}

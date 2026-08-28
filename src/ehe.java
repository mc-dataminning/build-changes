import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class ehe extends ehf {
   public static final MapCodec<ehe> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ehe::new));

   public ehe(jz $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dzo $$0) {
      return $$0.e();
   }

   @Override
   public egv<?> a() {
      return egv.e;
   }
}

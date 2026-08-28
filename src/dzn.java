import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dzn extends dzo {
   public static final MapCodec<dzn> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzn::new));

   public dzn(kd $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dse $$0) {
      return $$0.e();
   }

   @Override
   public dze<?> a() {
      return dze.e;
   }
}

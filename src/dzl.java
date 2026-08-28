import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dzl extends dzm {
   public static final MapCodec<dzl> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzl::new));

   public dzl(kd $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsc $$0) {
      return $$0.e();
   }

   @Override
   public dzc<?> a() {
      return dzc.e;
   }
}

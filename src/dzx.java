import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dzx extends dzy {
   public static final MapCodec<dzx> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzx::new));

   public dzx(ke $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsl $$0) {
      return $$0.e();
   }

   @Override
   public dzo<?> a() {
      return dzo.e;
   }
}

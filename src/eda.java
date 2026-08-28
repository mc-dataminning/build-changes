import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class eda extends edb {
   public static final MapCodec<eda> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eda::new));

   public eda(kl $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dvo $$0) {
      return $$0.e();
   }

   @Override
   public ecr<?> a() {
      return ecr.e;
   }
}

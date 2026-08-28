import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class efa extends efb {
   public static final MapCodec<efa> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, efa::new));

   public efa(kl $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dxo $$0) {
      return $$0.e();
   }

   @Override
   public eer<?> a() {
      return eer.e;
   }
}

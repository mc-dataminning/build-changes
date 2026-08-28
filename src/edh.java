import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class edh extends edi {
   public static final MapCodec<edh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, edh::new));

   public edh(kl $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dvv $$0) {
      return $$0.e();
   }

   @Override
   public ecy<?> a() {
      return ecy.e;
   }
}

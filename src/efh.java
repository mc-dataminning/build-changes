import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class efh extends efi {
   public static final MapCodec<efh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, efh::new));

   public efh(kl $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dxv $$0) {
      return $$0.e();
   }

   @Override
   public eey<?> a() {
      return eey.e;
   }
}

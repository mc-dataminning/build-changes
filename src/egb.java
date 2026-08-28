import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class egb extends egd {
   public static final MapCodec<egb> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, egb::new));

   public egb(kn $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dym $$0) {
      return $$0.v();
   }

   @Override
   public eft<?> a() {
      return eft.f;
   }
}

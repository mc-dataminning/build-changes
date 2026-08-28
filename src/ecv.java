import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ecv extends ecx {
   public static final MapCodec<ecv> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ecv::new));

   public ecv(kl $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dvj $$0) {
      return $$0.v();
   }

   @Override
   public ecn<?> a() {
      return ecn.f;
   }
}

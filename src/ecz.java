import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ecz extends edb {
   public static final MapCodec<ecz> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ecz::new));

   public ecz(kl $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dvo $$0) {
      return $$0.v();
   }

   @Override
   public ecr<?> a() {
      return ecr.f;
   }
}

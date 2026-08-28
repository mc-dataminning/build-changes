import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ece extends ecg {
   public static final MapCodec<ece> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ece::new));

   public ece(kj $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dus $$0) {
      return $$0.v();
   }

   @Override
   public ebw<?> a() {
      return ebw.f;
   }
}

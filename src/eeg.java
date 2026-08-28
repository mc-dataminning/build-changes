import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eeg extends eei {
   public static final MapCodec<eeg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eeg::new));

   public eeg(km $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dwv $$0) {
      return $$0.v();
   }

   @Override
   public edy<?> a() {
      return edy.f;
   }
}

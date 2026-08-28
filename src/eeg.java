import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eeg extends eek {
   private final jv<esy> e;
   public static final MapCodec<eeg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kg.a(mc.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, eeg::new)
   );

   public eeg(km $$0, jv<esy> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dwx $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public eea<?> a() {
      return eea.c;
   }
}

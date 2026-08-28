import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eeg extends eel {
   private final jv<djn> e;
   public static final MapCodec<eeg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kg.a(mc.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, eeg::new)
   );

   public eeg(km $$0, jv<djn> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dwy $$0) {
      return $$0.a(this.e);
   }

   @Override
   public eeb<?> a() {
      return eeb.a;
   }
}

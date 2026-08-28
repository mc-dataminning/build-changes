import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eez extends efb {
   public static final MapCodec<eez> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eez::new));

   public eez(kl $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dxo $$0) {
      return $$0.v();
   }

   @Override
   public eer<?> a() {
      return eer.f;
   }
}

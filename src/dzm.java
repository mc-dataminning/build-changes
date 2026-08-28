import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzm extends dzo {
   public static final MapCodec<dzm> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzm::new));

   public dzm(kd $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dse $$0) {
      return $$0.r();
   }

   @Override
   public dze<?> a() {
      return dze.f;
   }
}

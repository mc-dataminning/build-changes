import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzk extends dzm {
   public static final MapCodec<dzk> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzk::new));

   public dzk(kd $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsc $$0) {
      return $$0.r();
   }

   @Override
   public dzc<?> a() {
      return dzc.f;
   }
}

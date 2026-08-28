import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzp extends dzr {
   public static final MapCodec<dzp> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzp::new));

   public dzp(ke $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsh $$0) {
      return $$0.r();
   }

   @Override
   public dzh<?> a() {
      return dzh.f;
   }
}

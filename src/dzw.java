import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzw extends dzy {
   public static final MapCodec<dzw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzw::new));

   public dzw(ke $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsl $$0) {
      return $$0.r();
   }

   @Override
   public dzo<?> a() {
      return dzo.f;
   }
}

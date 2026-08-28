import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzj extends dzl {
   public static final MapCodec<dzj> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzj::new));

   public dzj(kd $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsb $$0) {
      return $$0.r();
   }

   @Override
   public dzb<?> a() {
      return dzb.f;
   }
}

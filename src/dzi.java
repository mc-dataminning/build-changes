import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzi extends dzk {
   public static final MapCodec<dzi> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzi::new));

   public dzi(kd $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsa $$0) {
      return $$0.r();
   }

   @Override
   public dza<?> a() {
      return dza.f;
   }
}

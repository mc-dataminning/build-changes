import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzf extends dzh {
   public static final MapCodec<dzf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzf::new));

   public dzf(kd $$0) {
      super($$0);
   }

   @Override
   protected boolean a(drx $$0) {
      return $$0.r();
   }

   @Override
   public dyx<?> a() {
      return dyx.f;
   }
}

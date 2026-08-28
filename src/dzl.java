import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzl extends dzn {
   public static final MapCodec<dzl> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzl::new));

   public dzl(kd $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsd $$0) {
      return $$0.r();
   }

   @Override
   public dzd<?> a() {
      return dzd.f;
   }
}

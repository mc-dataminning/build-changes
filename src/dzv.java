import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzv extends dzx {
   public static final MapCodec<dzv> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzv::new));

   public dzv(ke $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsk $$0) {
      return $$0.r();
   }

   @Override
   public dzn<?> a() {
      return dzn.f;
   }
}

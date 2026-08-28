import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class efe extends efg {
   public static final MapCodec<efe> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, efe::new));

   public efe(km $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dxq $$0) {
      return $$0.v();
   }

   @Override
   public eew<?> a() {
      return eew.f;
   }
}

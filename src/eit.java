import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eit extends eiv {
   public static final MapCodec<eit> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eit::new));

   public eit(ka $$0) {
      super($$0);
   }

   @Override
   protected boolean a(ebe $$0) {
      return $$0.v();
   }

   @Override
   public eil<?> a() {
      return eil.f;
   }
}

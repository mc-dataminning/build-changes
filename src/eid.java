import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eid extends eif {
   public static final MapCodec<eid> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eid::new));

   public eid(ka $$0) {
      super($$0);
   }

   @Override
   protected boolean a(eao $$0) {
      return $$0.v();
   }

   @Override
   public ehv<?> a() {
      return ehv.f;
   }
}

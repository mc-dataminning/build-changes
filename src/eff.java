import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eff extends efh {
   public static final MapCodec<eff> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eff::new));

   public eff(kl $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dxu $$0) {
      return $$0.v();
   }

   @Override
   public eex<?> a() {
      return eex.f;
   }
}

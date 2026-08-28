import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eao extends eaq {
   public static final MapCodec<eao> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eao::new));

   public eao(kh $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dtc $$0) {
      return $$0.r();
   }

   @Override
   public eag<?> a() {
      return eag.f;
   }
}

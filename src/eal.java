import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eal extends ean {
   public static final MapCodec<eal> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eal::new));

   public eal(kh $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dta $$0) {
      return $$0.r();
   }

   @Override
   public ead<?> a() {
      return ead.f;
   }
}

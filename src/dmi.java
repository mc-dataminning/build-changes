import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmi extends dmk {
   public static final Codec<dmi> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dmi::new));

   public dmi(ib $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dfj $$0) {
      return $$0.r();
   }

   @Override
   public dma<?> a() {
      return dma.f;
   }
}

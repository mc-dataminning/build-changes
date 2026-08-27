import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dly extends dma {
   public static final Codec<dly> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dly::new));

   public dly(hz $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dez $$0) {
      return $$0.r();
   }

   @Override
   public dlq<?> a() {
      return dlq.f;
   }
}

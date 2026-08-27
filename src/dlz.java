import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dlz extends dma {
   public static final Codec<dlz> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dlz::new));

   public dlz(hz $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dez $$0) {
      return $$0.e();
   }

   @Override
   public dlq<?> a() {
      return dlq.e;
   }
}

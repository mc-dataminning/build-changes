import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dma extends dmb {
   public static final Codec<dma> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dma::new));

   public dma(hz $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dfa $$0) {
      return $$0.e();
   }

   @Override
   public dlr<?> a() {
      return dlr.e;
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dmj extends dmk {
   public static final Codec<dmj> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dmj::new));

   public dmj(hy $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dfj $$0) {
      return $$0.e();
   }

   @Override
   public dma<?> a() {
      return dma.e;
   }
}

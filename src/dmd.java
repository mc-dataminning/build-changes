import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dmd extends dme {
   public static final Codec<dmd> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dmd::new));

   public dmd(hy $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dfd $$0) {
      return $$0.e();
   }

   @Override
   public dlu<?> a() {
      return dlu.e;
   }
}

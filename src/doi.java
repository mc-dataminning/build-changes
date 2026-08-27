import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class doi extends doj {
   public static final Codec<doi> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, doi::new));

   public doi(iw $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dhi $$0) {
      return $$0.e();
   }

   @Override
   public dnz<?> a() {
      return dnz.e;
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dly extends dlz {
   public static final Codec<dly> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dly::new));

   public dly(ia $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dey $$0) {
      return $$0.e();
   }

   @Override
   public dlp<?> a() {
      return dlp.e;
   }
}

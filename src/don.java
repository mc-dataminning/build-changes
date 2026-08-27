import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class don extends doo {
   public static final Codec<don> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, don::new));

   public don(ja $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dhn $$0) {
      return $$0.e();
   }

   @Override
   public doe<?> a() {
      return doe.e;
   }
}

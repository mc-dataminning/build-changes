import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dwi extends dwj {
   public static final Codec<dwi> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dwi::new));

   public dwi(jg $$0) {
      super($$0);
   }

   @Override
   protected boolean a(doz $$0) {
      return $$0.e();
   }

   @Override
   public dvz<?> a() {
      return dvz.e;
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeo implements eee {
   public static final Codec<eeo> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, eeo::new)
   );
   public final float l;

   public eeo(float $$0) {
      this.l = $$0;
   }
}

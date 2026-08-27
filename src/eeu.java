import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeu implements eek {
   public static final Codec<eeu> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, eeu::new)
   );
   public final float l;

   public eeu(float $$0) {
      this.l = $$0;
   }
}

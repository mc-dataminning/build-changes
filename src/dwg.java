import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwg implements dvw {
   public static final Codec<dwg> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, dwg::new)
   );
   public final float l;

   public dwg(float $$0) {
      this.l = $$0;
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emz implements emp {
   public static final Codec<emz> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, emz::new)
   );
   public final float l;

   public emz(float $$0) {
      this.l = $$0;
   }
}

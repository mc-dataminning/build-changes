import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dye implements dxu {
   public static final Codec<dye> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, dye::new)
   );
   public final float l;

   public dye(float $$0) {
      this.l = $$0;
   }
}

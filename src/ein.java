import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ein implements eid {
   public static final Codec<ein> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, ein::new)
   );
   public final float l;

   public ein(float $$0) {
      this.l = $$0;
   }
}

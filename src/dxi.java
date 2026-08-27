import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxi implements dwy {
   public static final Codec<dxi> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, dxi::new)
   );
   public final float l;

   public dxi(float $$0) {
      this.l = $$0;
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebr implements ebh {
   public static final Codec<ebr> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, ebr::new)
   );
   public final float l;

   public ebr(float $$0) {
      this.l = $$0;
   }
}

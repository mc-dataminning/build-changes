import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duq implements dug {
   public static final Codec<duq> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, duq::new)
   );
   public final float l;

   public duq(float $$0) {
      this.l = $$0;
   }
}

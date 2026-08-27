import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecl implements ecb {
   public static final Codec<ecl> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, ecl::new)
   );
   public final float l;

   public ecl(float $$0) {
      this.l = $$0;
   }
}

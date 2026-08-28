import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enl implements enb {
   public static final Codec<enl> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, enl::new)
   );
   public final float l;

   public enl(float $$0) {
      this.l = $$0;
   }
}

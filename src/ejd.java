import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejd implements eit {
   public static final Codec<ejd> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, ejd::new)
   );
   public final float l;

   public ejd(float $$0) {
      this.l = $$0;
   }
}

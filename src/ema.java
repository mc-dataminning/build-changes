import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ema implements elq {
   public static final Codec<ema> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, ema::new)
   );
   public final float l;

   public ema(float $$0) {
      this.l = $$0;
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehk implements eha {
   public static final Codec<ehk> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, ehk::new)
   );
   public final float l;

   public ehk(float $$0) {
      this.l = $$0;
   }
}

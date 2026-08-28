import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eim implements eic {
   public static final Codec<eim> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, eim::new)
   );
   public final float l;

   public eim(float $$0) {
      this.l = $$0;
   }
}

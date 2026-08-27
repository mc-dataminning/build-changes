import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eaj implements dzz {
   public static final Codec<eaj> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, eaj::new)
   );
   public final float l;

   public eaj(float $$0) {
      this.l = $$0;
   }
}

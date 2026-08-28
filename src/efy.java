import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efy implements efu {
   public static final Codec<efy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dyk.c).fieldOf("height").forGetter($$0x -> $$0x.b), duo.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, efy::new)
   );
   public final int b;
   public final duo c;

   public efy(int $$0, duo $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}

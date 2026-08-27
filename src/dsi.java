import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsi implements dse {
   public static final Codec<dsi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dkw.c).fieldOf("height").forGetter($$0x -> $$0x.b), dhn.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dsi::new)
   );
   public final int b;
   public final dhn c;

   public dsi(int $$0, dhn $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}

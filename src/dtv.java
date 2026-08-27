import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtv implements dtr {
   public static final Codec<dtv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dmj.c).fieldOf("height").forGetter($$0x -> $$0x.b), dja.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dtv::new)
   );
   public final int b;
   public final dja c;

   public dtv(int $$0, dja $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}

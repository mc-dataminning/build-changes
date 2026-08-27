import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwa implements dvw {
   public static final Codec<dwa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, doo.c).fieldOf("height").forGetter($$0x -> $$0x.b), dlf.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dwa::new)
   );
   public final int b;
   public final dlf c;

   public dwa(int $$0, dlf $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}

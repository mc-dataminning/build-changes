import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eie implements eia {
   public static final Codec<eie> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, eaq.c).fieldOf("height").forGetter($$0x -> $$0x.b), dwv.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, eie::new)
   );
   public final int b;
   public final dwv c;

   public eie(int $$0, dwv $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}

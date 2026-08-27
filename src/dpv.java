import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpv implements dpr {
   public static final Codec<dpv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dij.c).fieldOf("height").forGetter($$0x -> $$0x.b), dfa.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dpv::new)
   );
   public final int b;
   public final dfa c;

   public dpv(int $$0, dfa $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}

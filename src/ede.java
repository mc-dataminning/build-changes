import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ede implements eda {
   public static final Codec<ede> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dvs.c).fieldOf("height").forGetter($$0x -> $$0x.b), dsa.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, ede::new)
   );
   public final int b;
   public final dsa c;

   public ede(int $$0, dsa $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}

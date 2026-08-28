import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emt implements emp {
   public static final Codec<emt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, efb.c).fieldOf("height").forGetter($$0x -> $$0x.b), ebe.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, emt::new)
   );
   public final int b;
   public final ebe c;

   public emt(int $$0, ebe $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}

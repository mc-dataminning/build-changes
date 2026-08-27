import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ead implements dzz {
   public static final Codec<ead> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dsr.c).fieldOf("height").forGetter($$0x -> $$0x.b), doz.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, ead::new)
   );
   public final int b;
   public final doz c;

   public ead(int $$0, doz $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}

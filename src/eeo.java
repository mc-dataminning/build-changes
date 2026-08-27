import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeo implements eek {
   public static final Codec<eeo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dwu.c).fieldOf("height").forGetter($$0x -> $$0x.b), dtc.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, eeo::new)
   );
   public final int b;
   public final dtc c;

   public eeo(int $$0, dtc $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}

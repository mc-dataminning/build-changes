import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsd implements drz {
   public static final Codec<dsd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dkr.c).fieldOf("height").forGetter($$0x -> $$0x.b), dhi.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dsd::new)
   );
   public final int b;
   public final dhi c;

   public dsd(int $$0, dhi $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}

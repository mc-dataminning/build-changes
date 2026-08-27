import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpt implements dpp {
   public static final Codec<dpt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dih.c).fieldOf("height").forGetter($$0x -> $$0x.b), dey.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dpt::new)
   );
   public final int b;
   public final dey c;

   public dpt(int $$0, dey $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}

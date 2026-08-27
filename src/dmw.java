import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmw implements dms {
   public static final Codec<dmw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dfk.c).fieldOf("height").forGetter($$0x -> $$0x.b), dcb.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dmw::new)
   );
   public final int b;
   public final dcb c;

   public dmw(int $$0, dcb $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}

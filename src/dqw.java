import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqw implements dqs {
   public static final Codec<dqw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, djk.c).fieldOf("height").forGetter($$0x -> $$0x.b), dgb.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dqw::new)
   );
   public final int b;
   public final dgb c;

   public dqw(int $$0, dgb $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}

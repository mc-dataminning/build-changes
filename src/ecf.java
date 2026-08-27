import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecf implements ebh {
   public static final Codec<ecf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(0, 512).fieldOf("floor_search_range").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("placement_radius_around_floor").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("placement_probability_per_valid_position").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ecf::new)
   );
   public final int b;
   public final int c;
   public final float d;

   public ecf(int $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}

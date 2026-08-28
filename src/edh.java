import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edh implements ede {
   public static final Codec<edh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 512).fieldOf("floor_to_ceiling_search_range").orElse(30).forGetter($$0x -> $$0x.b),
               bqb.b(1, 60).fieldOf("column_radius").forGetter($$0x -> $$0x.c),
               bpz.a(0.0F, 20.0F).fieldOf("height_scale").forGetter($$0x -> $$0x.d),
               Codec.floatRange(0.1F, 1.0F).fieldOf("max_column_radius_to_cave_height_ratio").forGetter($$0x -> $$0x.e),
               bpz.a(0.1F, 10.0F).fieldOf("stalactite_bluntness").forGetter($$0x -> $$0x.f),
               bpz.a(0.1F, 10.0F).fieldOf("stalagmite_bluntness").forGetter($$0x -> $$0x.g),
               bpz.a(0.0F, 2.0F).fieldOf("wind_speed").forGetter($$0x -> $$0x.h),
               Codec.intRange(0, 100).fieldOf("min_radius_for_wind").forGetter($$0x -> $$0x.i),
               Codec.floatRange(0.0F, 5.0F).fieldOf("min_bluntness_for_wind").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, edh::new)
   );
   public final int b;
   public final bqb c;
   public final bpz d;
   public final float e;
   public final bpz f;
   public final bpz g;
   public final bpz h;
   public final int i;
   public final float j;

   public edh(int $$0, bqb $$1, bpz $$2, float $$3, bpz $$4, bpz $$5, bpz $$6, int $$7, float $$8) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
   }
}

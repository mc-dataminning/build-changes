import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class een implements eek {
   public static final Codec<een> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 512).fieldOf("floor_to_ceiling_search_range").orElse(30).forGetter($$0x -> $$0x.b),
               bpf.b(1, 60).fieldOf("column_radius").forGetter($$0x -> $$0x.c),
               bpd.a(0.0F, 20.0F).fieldOf("height_scale").forGetter($$0x -> $$0x.d),
               Codec.floatRange(0.1F, 1.0F).fieldOf("max_column_radius_to_cave_height_ratio").forGetter($$0x -> $$0x.e),
               bpd.a(0.1F, 10.0F).fieldOf("stalactite_bluntness").forGetter($$0x -> $$0x.f),
               bpd.a(0.1F, 10.0F).fieldOf("stalagmite_bluntness").forGetter($$0x -> $$0x.g),
               bpd.a(0.0F, 2.0F).fieldOf("wind_speed").forGetter($$0x -> $$0x.h),
               Codec.intRange(0, 100).fieldOf("min_radius_for_wind").forGetter($$0x -> $$0x.i),
               Codec.floatRange(0.0F, 5.0F).fieldOf("min_bluntness_for_wind").forGetter($$0x -> $$0x.j),
               lh.e.q().xmap($$0x -> (dla)$$0x, $$0x -> $$0x).fieldOf("block").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, een::new)
   );
   public final int b;
   public final bpf c;
   public final bpd d;
   public final float e;
   public final bpd f;
   public final bpd g;
   public final bpd h;
   public final int i;
   public final float j;
   public final dla k;

   public een(int $$0, bpf $$1, bpd $$2, float $$3, bpd $$4, bpd $$5, bpd $$6, int $$7, float $$8, dla $$9) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
      this.k = $$9;
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egn implements egp {
   public static final Codec<egn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 512).fieldOf("floor_to_ceiling_search_range").forGetter($$0x -> $$0x.b),
               bri.b(1, 128).fieldOf("height").forGetter($$0x -> $$0x.c),
               bri.b(1, 128).fieldOf("radius").forGetter($$0x -> $$0x.d),
               Codec.intRange(0, 64).fieldOf("max_stalagmite_stalactite_height_diff").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 64).fieldOf("height_deviation").forGetter($$0x -> $$0x.f),
               bri.b(0, 128).fieldOf("dripstone_block_layer_thickness").forGetter($$0x -> $$0x.g),
               brg.a(0.0F, 2.0F).fieldOf("density").forGetter($$0x -> $$0x.h),
               brg.a(0.0F, 2.0F).fieldOf("wetness").forGetter($$0x -> $$0x.i),
               Codec.floatRange(0.0F, 1.0F).fieldOf("chance_of_dripstone_column_at_max_distance_from_center").forGetter($$0x -> $$0x.j),
               Codec.intRange(1, 64).fieldOf("max_distance_from_edge_affecting_chance_of_dripstone_column").forGetter($$0x -> $$0x.k),
               Codec.intRange(1, 64).fieldOf("max_distance_from_center_affecting_height_bias").forGetter($$0x -> $$0x.l)
            )
            .apply($$0, egn::new)
   );
   public final int b;
   public final bri c;
   public final bri d;
   public final int e;
   public final int f;
   public final bri g;
   public final brg h;
   public final brg i;
   public final float j;
   public final int k;
   public final int l;

   public egn(int $$0, bri $$1, bri $$2, int $$3, int $$4, bri $$5, brg $$6, brg $$7, float $$8, int $$9, int $$10) {
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
      this.l = $$10;
   }
}

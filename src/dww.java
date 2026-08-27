import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dww implements dwy {
   public static final Codec<dww> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 512).fieldOf("floor_to_ceiling_search_range").forGetter($$0x -> $$0x.b),
               blq.b(1, 128).fieldOf("height").forGetter($$0x -> $$0x.c),
               blq.b(1, 128).fieldOf("radius").forGetter($$0x -> $$0x.d),
               Codec.intRange(0, 64).fieldOf("max_stalagmite_stalactite_height_diff").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 64).fieldOf("height_deviation").forGetter($$0x -> $$0x.f),
               blq.b(0, 128).fieldOf("dripstone_block_layer_thickness").forGetter($$0x -> $$0x.g),
               blo.a(0.0F, 2.0F).fieldOf("density").forGetter($$0x -> $$0x.h),
               blo.a(0.0F, 2.0F).fieldOf("wetness").forGetter($$0x -> $$0x.i),
               Codec.floatRange(0.0F, 1.0F).fieldOf("chance_of_dripstone_column_at_max_distance_from_center").forGetter($$0x -> $$0x.j),
               Codec.intRange(1, 64).fieldOf("max_distance_from_edge_affecting_chance_of_dripstone_column").forGetter($$0x -> $$0x.k),
               Codec.intRange(1, 64).fieldOf("max_distance_from_center_affecting_height_bias").forGetter($$0x -> $$0x.l)
            )
            .apply($$0, dww::new)
   );
   public final int b;
   public final blq c;
   public final blq d;
   public final int e;
   public final int f;
   public final blq g;
   public final blo h;
   public final blo i;
   public final float j;
   public final int k;
   public final int l;

   public dww(int $$0, blq $$1, blq $$2, int $$3, int $$4, blq $$5, blo $$6, blo $$7, float $$8, int $$9, int $$10) {
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

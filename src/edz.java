import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edz implements eda {
   public static final Codec<edz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.b(lq.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               efb.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               ehm.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               ehd.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bpx.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bpx.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, edz::new)
   );
   public final axe<dex> b;
   public final efb c;
   public final ji<ehm> d;
   public final ehd e;
   public final bpx f;
   public final float g;
   public final int h;
   public final float i;
   public final bpx j;
   public final float k;

   public edz(axe<dex> $$0, efb $$1, ji<ehm> $$2, ehd $$3, bpx $$4, float $$5, int $$6, float $$7, bpx $$8, float $$9) {
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

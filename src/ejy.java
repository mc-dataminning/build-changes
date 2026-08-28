import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejy implements eiz {
   public static final Codec<ejy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayk.b(mb.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               ela.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               enn.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               end.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bsn.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bsn.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ejy::new)
   );
   public final ayk<dkl> b;
   public final ela c;
   public final jq<enn> d;
   public final end e;
   public final bsn f;
   public final float g;
   public final int h;
   public final float i;
   public final bsn j;
   public final float k;

   public ejy(ayk<dkl> $$0, ela $$1, jq<enn> $$2, end $$3, bsn $$4, float $$5, int $$6, float $$7, bsn $$8, float $$9) {
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

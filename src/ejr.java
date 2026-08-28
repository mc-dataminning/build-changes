import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejr implements eis {
   public static final Codec<ejr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayk.b(mb.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               ekt.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               eng.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               emw.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bsj.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bsj.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ejr::new)
   );
   public final ayk<dke> b;
   public final ekt c;
   public final jq<eng> d;
   public final emw e;
   public final bsj f;
   public final float g;
   public final int h;
   public final float i;
   public final bsj j;
   public final float k;

   public ejr(ayk<dke> $$0, ekt $$1, jq<eng> $$2, emw $$3, bsj $$4, float $$5, int $$6, float $$7, bsj $$8, float $$9) {
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

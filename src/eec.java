import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eec implements edd {
   public static final Codec<eec> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axf.b(lq.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               efe.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               ehp.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               ehg.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bqa.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bqa.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eec::new)
   );
   public final axf<dfa> b;
   public final efe c;
   public final ji<ehp> d;
   public final ehg e;
   public final bqa f;
   public final float g;
   public final int h;
   public final float i;
   public final bqa j;
   public final float k;

   public eec(axf<dfa> $$0, efe $$1, ji<ehp> $$2, ehg $$3, bqa $$4, float $$5, int $$6, float $$7, bqa $$8, float $$9) {
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

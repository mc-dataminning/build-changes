import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efh implements eei {
   public static final Codec<efh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.b(lu.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               egj.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               eiv.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               eil.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bpw.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bpw.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, efh::new)
   );
   public final awu<dfy> b;
   public final egj c;
   public final jm<eiv> d;
   public final eil e;
   public final bpw f;
   public final float g;
   public final int h;
   public final float i;
   public final bpw j;
   public final float k;

   public efh(awu<dfy> $$0, egj $$1, jm<eiv> $$2, eil $$3, bpw $$4, float $$5, int $$6, float $$7, bpw $$8, float $$9) {
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

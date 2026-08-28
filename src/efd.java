import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efd implements eee {
   public static final Codec<efd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awt.b(lu.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               egf.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               eiq.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               eih.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bpv.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bpv.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, efd::new)
   );
   public final awt<dfw> b;
   public final egf c;
   public final jm<eiq> d;
   public final eih e;
   public final bpv f;
   public final float g;
   public final int h;
   public final float i;
   public final bpv j;
   public final float k;

   public efd(awt<dfw> $$0, egf $$1, jm<eiq> $$2, eih $$3, bpv $$4, float $$5, int $$6, float $$7, bpv $$8, float $$9) {
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

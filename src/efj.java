import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efj implements eek {
   public static final Codec<efj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awt.b(li.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               egl.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               eix.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               ein.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bpf.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bpf.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, efj::new)
   );
   public final awt<dfc> b;
   public final egl c;
   public final ja<eix> d;
   public final ein e;
   public final bpf f;
   public final float g;
   public final int h;
   public final float i;
   public final bpf j;
   public final float k;

   public efj(awt<dfc> $$0, egl $$1, ja<eix> $$2, ein $$3, bpf $$4, float $$5, int $$6, float $$7, bpf $$8, float $$9) {
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

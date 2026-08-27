import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyt implements dxu {
   public static final Codec<dyt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avd.b(kj.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dzv.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               ecg.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               ebx.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bmh.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bmh.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dyt::new)
   );
   public final avd<daa> b;
   public final dzv c;
   public final il<ecg> d;
   public final ebx e;
   public final bmh f;
   public final float g;
   public final int h;
   public final float i;
   public final bmh j;
   public final float k;

   public dyt(avd<daa> $$0, dzv $$1, il<ecg> $$2, ebx $$3, bmh $$4, float $$5, int $$6, float $$7, bmh $$8, float $$9) {
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

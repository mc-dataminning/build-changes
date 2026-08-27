import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyv implements dxw {
   public static final Codec<dyv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avd.b(kj.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dzx.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               eci.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               ebz.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bmi.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bmi.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dyv::new)
   );
   public final avd<dac> b;
   public final dzx c;
   public final il<eci> d;
   public final ebz e;
   public final bmi f;
   public final float g;
   public final int h;
   public final float i;
   public final bmi j;
   public final float k;

   public dyv(avd<dac> $$0, dzx $$1, il<eci> $$2, ebz $$3, bmi $$4, float $$5, int $$6, float $$7, bmi $$8, float $$9) {
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

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxo extends ebi {
   public static final MapCodec<dxo> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               een.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bnt.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dwk.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dxp.b.optionalFieldOf("debug_settings", dxp.a).forGetter($$0x -> $$0x.h),
               jk.a(ld.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dxo::new)
   );
   public final een e;
   public final bnt f;
   public final dwk g;
   public final dxp h;
   public final iz<dcv> i;

   public dxo(float $$0, een $$1, bnt $$2, dwk $$3, dxp $$4, iz<dcv> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}

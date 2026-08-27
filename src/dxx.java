import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxx extends ebr {
   public static final MapCodec<dxx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               eew.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bop.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dwt.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dxy.b.optionalFieldOf("debug_settings", dxy.a).forGetter($$0x -> $$0x.h),
               jl.a(le.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dxx::new)
   );
   public final eew e;
   public final bop f;
   public final dwt g;
   public final dxy h;
   public final ja<dde> i;

   public dxx(float $$0, eew $$1, bop $$2, dwt $$3, dxy $$4, ja<dde> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}

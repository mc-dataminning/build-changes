import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efh extends ejc {
   public static final MapCodec<efh> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               emj.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bsh.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               eec.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               efi.b.optionalFieldOf("debug_settings", efi.a).forGetter($$0x -> $$0x.h),
               kf.a(mb.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, efh::new)
   );
   public final emj e;
   public final bsh f;
   public final eec g;
   public final efi h;
   public final ju<dke> i;

   public efh(float $$0, emj $$1, bsh $$2, eec $$3, efi $$4, ju<dke> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}

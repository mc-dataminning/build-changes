import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efi extends ejd {
   public static final MapCodec<efi> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               emk.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bsd.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               eed.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               efj.b.optionalFieldOf("debug_settings", efj.a).forGetter($$0x -> $$0x.h),
               kf.a(mb.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, efi::new)
   );
   public final emk e;
   public final bsd f;
   public final eed g;
   public final efj h;
   public final ju<dkd> i;

   public efi(float $$0, emk $$1, bsd $$2, eed $$3, efj $$4, ju<dkd> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}

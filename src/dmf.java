import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmf extends dpz {
   public static final MapCodec<dmf> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dte.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bfr.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dlb.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dmg.b.optionalFieldOf("debug_settings", dmg.a).forGetter($$0x -> $$0x.h),
               hu.a(jd.e).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dmf::new)
   );
   public final dte e;
   public final bfr f;
   public final dlb g;
   public final dmg h;
   public final hj<csk> i;

   public dmf(float $$0, dte $$1, bfr $$2, dlb $$3, dmg $$4, hj<csk> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}

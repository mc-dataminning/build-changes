import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpw extends dtq {
   public static final MapCodec<dpw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dwv.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bio.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dos.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dpx.b.optionalFieldOf("debug_settings", dpx.a).forGetter($$0x -> $$0x.h),
               it.a(kc.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dpw::new)
   );
   public final dwv e;
   public final bio f;
   public final dos g;
   public final dpx h;
   public final ij<cvz> i;

   public dpw(float $$0, dwv $$1, bio $$2, dos $$3, dpx $$4, ij<cvz> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}

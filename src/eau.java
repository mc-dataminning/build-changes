import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eau extends eeo {
   public static final MapCodec<eau> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               eht.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bpt.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dzp.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               eav.b.optionalFieldOf("debug_settings", eav.a).forGetter($$0x -> $$0x.h),
               kb.a(lu.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, eau::new)
   );
   public final eht e;
   public final bpt f;
   public final dzp g;
   public final eav h;
   public final jq<dfw> i;

   public eau(float $$0, eht $$1, bpt $$2, dzp $$3, eav $$4, jq<dfw> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}

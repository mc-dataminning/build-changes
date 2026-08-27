import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dni extends drc {
   public static final MapCodec<dni> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               duh.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bhe.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dme.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dnj.b.optionalFieldOf("debug_settings", dnj.a).forGetter($$0x -> $$0x.h),
               iq.a(jz.e).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dni::new)
   );
   public final duh e;
   public final bhe f;
   public final dme g;
   public final dnj h;
   public final ig<cua> i;

   public dni(float $$0, duh $$1, bhe $$2, dme $$3, dnj $$4, ig<cua> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}

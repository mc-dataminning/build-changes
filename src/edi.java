import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edi extends ehd {
   public static final MapCodec<edi> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               eki.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               brk.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               ecd.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               edj.b.optionalFieldOf("debug_settings", edj.a).forGetter($$0x -> $$0x.h),
               kf.a(ma.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, edi::new)
   );
   public final eki e;
   public final brk f;
   public final ecd g;
   public final edj h;
   public final ju<dij> i;

   public edi(float $$0, eki $$1, brk $$2, ecd $$3, edj $$4, ju<dij> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eaf extends edz {
   public static final MapCodec<eaf> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               ehe.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bpk.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dza.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               eag.b.optionalFieldOf("debug_settings", eag.a).forGetter($$0x -> $$0x.h),
               jy.a(lr.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, eaf::new)
   );
   public final ehe e;
   public final bpk f;
   public final dza g;
   public final eag h;
   public final jn<dfi> i;

   public eaf(float $$0, ehe $$1, bpk $$2, dza $$3, eag $$4, jn<dfi> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}

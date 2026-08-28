import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eax extends eer {
   public static final MapCodec<eax> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               ehw.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bpu.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dzs.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               eay.b.optionalFieldOf("debug_settings", eay.a).forGetter($$0x -> $$0x.h),
               kb.a(lu.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, eax::new)
   );
   public final ehw e;
   public final bpu f;
   public final dzs g;
   public final eay h;
   public final jq<dfy> i;

   public eax(float $$0, ehw $$1, bpu $$2, dzs $$3, eay $$4, jq<dfy> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}

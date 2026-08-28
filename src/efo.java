import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efo extends ejj {
   public static final MapCodec<efo> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               emq.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bsl.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               eej.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               efp.b.optionalFieldOf("debug_settings", efp.a).forGetter($$0x -> $$0x.h),
               kf.a(mb.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, efo::new)
   );
   public final emq e;
   public final bsl f;
   public final eej g;
   public final efp h;
   public final ju<dkl> i;

   public efo(float $$0, emq $$1, bsl $$2, eej $$3, efp $$4, ju<dkl> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}

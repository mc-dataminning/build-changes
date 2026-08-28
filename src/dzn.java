import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzn extends edh {
   public static final MapCodec<dzn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               egm.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bps.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dyj.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dzo.b.optionalFieldOf("debug_settings", dzo.a).forGetter($$0x -> $$0x.h),
               jx.a(lq.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dzn::new)
   );
   public final egm e;
   public final bps f;
   public final dyj g;
   public final dzo h;
   public final jm<deu> i;

   public dzn(float $$0, egm $$1, bps $$2, dyj $$3, dzo $$4, jm<deu> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}

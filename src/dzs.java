import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzs extends edm {
   public static final MapCodec<dzs> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               egr.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bpx.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dyo.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dzt.b.optionalFieldOf("debug_settings", dzt.a).forGetter($$0x -> $$0x.h),
               jx.a(lq.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dzs::new)
   );
   public final egr e;
   public final bpx f;
   public final dyo g;
   public final dzt h;
   public final jm<dez> i;

   public dzs(float $$0, egr $$1, bpx $$2, dyo $$3, dzt $$4, jm<dez> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}

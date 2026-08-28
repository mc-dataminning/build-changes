import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzr extends edl {
   public static final MapCodec<dzr> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               egq.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bpw.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dyn.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dzs.b.optionalFieldOf("debug_settings", dzs.a).forGetter($$0x -> $$0x.h),
               jx.a(lq.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dzr::new)
   );
   public final egq e;
   public final bpw f;
   public final dyn g;
   public final dzs h;
   public final jm<dey> i;

   public dzr(float $$0, egq $$1, bpw $$2, dyn $$3, dzs $$4, jm<dey> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}

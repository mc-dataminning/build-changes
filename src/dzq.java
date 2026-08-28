import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzq extends edk {
   public static final MapCodec<dzq> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               egp.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bpv.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dym.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dzr.b.optionalFieldOf("debug_settings", dzr.a).forGetter($$0x -> $$0x.h),
               jx.a(lq.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dzq::new)
   );
   public final egp e;
   public final bpv f;
   public final dym g;
   public final dzr h;
   public final jm<dex> i;

   public dzq(float $$0, egp $$1, bpv $$2, dym $$3, dzr $$4, jm<dex> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}

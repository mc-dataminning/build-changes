import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzu extends edo {
   public static final MapCodec<dzu> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               egt.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bpz.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dyq.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dzv.b.optionalFieldOf("debug_settings", dzv.a).forGetter($$0x -> $$0x.h),
               jx.a(lq.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dzu::new)
   );
   public final egt e;
   public final bpz f;
   public final dyq g;
   public final dzv h;
   public final jm<dfb> i;

   public dzu(float $$0, egt $$1, bpz $$2, dyq $$3, dzv $$4, jm<dfb> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
